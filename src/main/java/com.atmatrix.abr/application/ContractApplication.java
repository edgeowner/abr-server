package com.atmatrix.abr.application;

import com.atmatrix.abr.application.dto.rent.RechargeDto;
import com.atmatrix.abr.application.dto.rent.RentContractDto;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingApplication
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 4:10 PM
 **/

public interface ContractApplication {

    /**
     * 充值
     *
     * @param rechargeDto
     */
    void rechargeBilling(RechargeDto rechargeDto);

    /**
     * 获取出租合约详情
     */
    String saveOrUpdateContractRent(RentContractDto rentContractDto);

    /**
     * 获取当前机器人出租合约
     *
     * @param robotUnionCode
     * @return
     */
    RentContractDto queryRentInfoByRobotUnionCode(String robotUnionCode);
}
