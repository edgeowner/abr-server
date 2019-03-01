package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.ContractApplication;
import com.atmatrix.abr.application.dto.condtion.RegionCondDto;
import com.atmatrix.abr.application.dto.rent.RechargeDto;
import com.atmatrix.abr.application.dto.rent.RentContractDto;
import com.atmatrix.abr.common.BizException;
import com.atmatrix.abr.common.constants.DeleteEnum;
import com.atmatrix.abr.common.util.IdWorker;
import com.atmatrix.abr.infrastructure.entity.UserAccount;
import com.atmatrix.abr.mgt.*;
import com.atmatrix.abr.mgt.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingApplicationImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 4:10 PM
 **/

@Service
public class ContractApplicationImpl implements ContractApplication {

    @Autowired
    private RobotBasicMgt robotBasicMgt;

    @Autowired
    private RobotDetailMgt robotDetailMgt;

    @Autowired
    private ContractRechargeMgt contractRechargeMgt;

    @Autowired
    private ContractRentMgt contractRentMgt;

    @Autowired
    private UserAccountMgt userAccountMgt;

    @Autowired
    private ContractRentAddressMgt contractRentAddressMgt;


    @Override
    public void rechargeBilling(RechargeDto rechargeDto) {
        String robotUnionCode = rechargeDto.getRobotUnionCode();
        Integer amount = rechargeDto.getAmount();
        RobotBasicDto robotBasic = robotBasicMgt.queryRobotBasicByUnionCode(robotUnionCode);
        if (!rechargeDto.getRobotAccountAddress().equals(robotBasic.getAccountAddress())) {
            throw new BizException("充值地址不是该机器人地址");
        }
        RobotDetailDto detail = robotDetailMgt.getRobotDetailDto(robotUnionCode);
        Integer billingPrice = detail.getBillingPrice();
        Integer totalPrice = amount * billingPrice;
        ContractRechargeDto toSave = new ContractRechargeDto();
        toSave.setUnionCode(String.valueOf(IdWorker.getId()));
        toSave.setAccountAddress(robotBasic.getAccountAddress());
        toSave.setFromAddress(null);
        toSave.setBillingType(detail.getBillingType());
        toSave.setAmount(amount);
        toSave.setUnitCode(detail.getUnitCode());
        toSave.setTotalPrice(totalPrice);
        toSave.setDelete(DeleteEnum.TRUE.getCode());
        contractRechargeMgt.saveRecharge(toSave);

    }


    @Transactional
    @Override
    public String saveOrUpdateContractRent(RentContractDto dto) {
        String unionCode = "";
        if (dto == null || dto.getId() == null || dto.getId() == 0) {
            String userUnionCode = String.valueOf(IdWorker.getId());
            dto.setUserUnionCode(userUnionCode);
            //保存用户信息
            userAccountMgt.saveUserAccount(buildUserAccount(dto));
            //保存出租合约信息
            unionCode = contractRentMgt.saveRentInfo(dto);
            //保存合约出租地址
            contractRentAddressMgt.saveAddress(buildRentAddress(dto));
        } else {
            //更新用户信息
            userAccountMgt.updateUserAccount(buildUserAccount(dto));
            //更新出租合约信息
            unionCode = contractRentMgt.updateRentInfo(dto);
            //更新合约出租地址
            contractRentAddressMgt.updateAddress(buildRentAddress(dto));
        }
        return unionCode;
    }

    private ContractRentAddressDto buildRentAddress(RentContractDto dto) {
        ContractRentAddressDto rentAddressDto = new ContractRentAddressDto();
        rentAddressDto.setRentUnionCode(dto.getUnionCode());
        RegionCondDto regionCondDto = dto.getRegionCondDto();

        if (StringUtils.isEmpty(dto.getWorkAddress())) {
            if (dto.getRegionCondDto() != null) {
                String regionCode = regionCondDto.getCode().concat(",").concat(regionCondDto.getChildCode());
                String regionName = regionCondDto.getName().concat(",").concat(regionCondDto.getChildName());
                rentAddressDto.setRegionCode(regionCode);
                rentAddressDto.setRegionName(regionName);
                rentAddressDto.setDelete(DeleteEnum.TRUE.getCode());
            } else {
                rentAddressDto = null;
            }
        } else {
            rentAddressDto.setWorkAddress(dto.getWorkAddress());
            rentAddressDto.setDelete(DeleteEnum.TRUE.getCode());
        }
        return rentAddressDto;
    }


    @Override
    public RentContractDto queryRentInfoByRobotUnionCode(String robotUnionCode) {
        RentContractDto result = new RentContractDto();
        if (StringUtils.isEmpty(robotUnionCode)) {
            throw new BizException("唯一标识为空");
        }
        RobotDetailExtendDto detailInfo = robotDetailMgt.getRobotDetailInfo(robotUnionCode);
        result.setBillingType(detailInfo.getBillingTypeCode());
        result.setBillingTypeName(detailInfo.getBillingTypeName());
        result.setBillingPrice(detailInfo.getBillingPrice());
        result.setBillingPriceUnit(detailInfo.getUnit());
        result.setDeviceId(detailInfo.getDeviceId());
        result.setRobotUnionCode(detailInfo.getRobotUnionCode());
        result.setRobotAddress(detailInfo.getAccountAddress());
        result.setOverdraft(detailInfo.getOverdraft());
        RentContractDto contractDto = contractRentMgt.queryByRobotUnionCode(robotUnionCode);
        if (contractDto == null) {
            result.setId(0);
            return result;
        } else {
            result.setId(contractDto.getId());
            result.setStartTime(contractDto.getStartTime());
            result.setEndTime(contractDto.getEndTime());
            result.setUserAddress(contractDto.getUserAddress());
            result.setUserName(contractDto.getUserName());
            result.setUserContact(contractDto.getUserContact());
            result.setUserUnionCode(contractDto.getUserUnionCode());
            result.setTotalPrice(contractDto.getTotalPrice());
        }
        return result;
    }

    private UserAccount buildUserAccount(RentContractDto dto) {
        UserAccount userAccount = new UserAccount();
        if (dto == null) {
            return null;
        } else {
            if (StringUtils.isEmpty(dto.getUserAddress())
                    && StringUtils.isEmpty(dto.getUserName())
                    && StringUtils.isEmpty(dto.getUserContact())
                    && StringUtils.isEmpty(dto.getUserUnionCode())) {
                return null;
            }
        }
        userAccount.setAccountAddress(dto.getUserAddress());
        userAccount.setUnionCode(dto.getUserUnionCode());
        userAccount.setName(dto.getUserName());
        userAccount.setPhone(dto.getUserContact());
        userAccount.setDelete(DeleteEnum.TRUE.getCode());
        return userAccount;
    }
}
