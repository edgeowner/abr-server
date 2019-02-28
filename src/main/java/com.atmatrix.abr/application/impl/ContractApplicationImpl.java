package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.ContractApplication;
import com.atmatrix.abr.application.dto.rent.RechargeDto;
import com.atmatrix.abr.application.dto.rent.RentContractDto;
import com.atmatrix.abr.common.BizException;
import com.atmatrix.abr.common.constants.DeleteEnum;
import com.atmatrix.abr.common.util.IdWorker;
import com.atmatrix.abr.infrastructure.entity.RobotDetail;
import com.atmatrix.abr.infrastructure.entity.UserAccount;
import com.atmatrix.abr.mgt.*;
import com.atmatrix.abr.mgt.dto.ContractRechargeDto;
import com.atmatrix.abr.mgt.dto.RobotBasicDto;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingApplicationImpl
 * @Description: TODO
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
        Integer id = dto.getId();
        String unionCode = "";
        if (id == null || id == 0) {
            String userUnionCode = String.valueOf(IdWorker.getId());
            dto.setUserUnionCode(userUnionCode);
            userAccountMgt.saveUserAccount(buildUserAccount(dto));
            unionCode = contractRentMgt.saveRentInfo(dto);
        } else {
            userAccountMgt.updateUserAccount(buildUserAccount(dto));
            unionCode = contractRentMgt.updateRentInfo(dto);
        }
        return unionCode;
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
        userAccount.setAccountAddress(dto.getUserAddress());
        userAccount.setUnionCode(dto.getUserUnionCode());
        userAccount.setAccountAddress(dto.getUserAddress());
        userAccount.setName(dto.getUserName());
        userAccount.setPhone(dto.getUserContact());
        userAccount.setDelete(DeleteEnum.TRUE.getCode());
        return userAccount;
    }
}
