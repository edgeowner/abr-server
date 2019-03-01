package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.application.dto.condtion.RegionCondDto;
import com.atmatrix.abr.application.dto.rent.RentContractDto;
import com.atmatrix.abr.common.constants.BillingTypeEnum;
import com.atmatrix.abr.common.util.DateUtils;
import com.atmatrix.abr.common.util.IdWorker;
import com.atmatrix.abr.infrastructure.dao.ContractRentExtendDao;
import com.atmatrix.abr.infrastructure.dao.ContractRentMapper;
import com.atmatrix.abr.infrastructure.dao.ContractRentTimeMapper;
import com.atmatrix.abr.infrastructure.entity.ContractRent;
import com.atmatrix.abr.infrastructure.entity.ContractRentExample;
import com.atmatrix.abr.infrastructure.entity.ContractRentTime;
import com.atmatrix.abr.mgt.ContractRentMgt;
import com.atmatrix.abr.mgt.dto.ContractRentExtendDto;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRentMgtImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 6:28 PM
 **/

@Component
public class ContractRentMgtImpl implements ContractRentMgt {

    @Autowired
    private ContractRentExtendDao rentExtendDao;

    @Autowired
    private ContractRentMapper rentMapper;

    @Autowired
    private ContractRentTimeMapper rentTimeMapper;

    @Override
    public RentContractDto queryByRobotUnionCode(String robotUnionCode) {
        ContractRentExtendDto resource = rentExtendDao.queryByRobotUnionCode(robotUnionCode);
        if (resource == null) {
            return new RentContractDto();
        }
        RentContractDto result = new RentContractDto();
        BeanUtils.copyProperties(resource, result);
        RegionCondDto regionDto = new RegionCondDto();
        if (!StringUtils.isEmpty(resource.getRegionCode()) && !StringUtils.isEmpty(resource.getRegionName())) {
            String[] codes = resource.getRegionCode().split(",");
            String[] names = resource.getRegionName().split(",");
            regionDto.setCode(codes[0]);
            regionDto.setName(names[1]);
            regionDto.setChildCode(codes[1]);
            regionDto.setChildName(names[1]);
        }
        result.setRegionCondDto(regionDto);
        return result;
    }


    @Override
    public String saveRentInfo(RentContractDto dto) {
        ContractRent contractRent = new ContractRent();
        String unionCode = String.valueOf(IdWorker.getId());
        contractRent.setUnionCode(unionCode);
        contractRent.setRobotUnionCode(dto.getRobotUnionCode());
        contractRent.setRentAddress(dto.getRentAddress());
        contractRent.setRobotAddress(dto.getRobotAddress());
        contractRent.setBillingPrice(dto.getBillingPrice());
        contractRent.setBillingPriceUnit(dto.getBillingPriceUnit());
        contractRent.setBillingType(dto.getBillingType());
        contractRent.setUserUnionCode(dto.getUserUnionCode());
        rentMapper.insert(contractRent);

        ContractRentTime time = new ContractRentTime();
        time.setRentStartTime(dto.getStartTime());
        time.setRentEndTime(dto.getEndTime());

        if (BillingTypeEnum.DAY.getCode().equals(dto.getBillingType())) {
            Integer actualPlus = (int) dto.getTotalPrice() / dto.getBillingPrice();
            String endTime = dto.getEndTime();
            DateTime endDate = DateUtils.parseDateToString(endTime, null);
            endDate.plusDays(actualPlus);
            time.setActualEndTime(endDate.toString(DateUtils.getDefaultPattern()));
        } else {
            time.setActualEndTime(dto.getEndTime());
        }
        rentTimeMapper.insert(time);
        return unionCode;
    }

    @Override
    public String updateRentInfo(RentContractDto dto) {
        ContractRentExample example = new ContractRentExample();
        ContractRentExample.Criteria criteria = example.createCriteria();
        criteria.andUnionCodeEqualTo(dto.getUnionCode());
        ContractRent contractRent = new ContractRent();
        contractRent.setTotalPrice(dto.getTotalPrice());
        contractRent.setUserName(dto.getUserName());
        contractRent.setUserContact(dto.getUserName());
        rentMapper.updateByExampleSelective(contractRent, example);
        return dto.getUnionCode();
    }
}
