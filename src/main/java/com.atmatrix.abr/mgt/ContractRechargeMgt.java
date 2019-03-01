package com.atmatrix.abr.mgt;

import com.atmatrix.abr.mgt.dto.ContractRechargeDto;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRechargeMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 4:52 PM
 **/

public interface ContractRechargeMgt {

    void saveRecharge(ContractRechargeDto contractRecharge);
}
