package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.infrastructure.dao.ContractRechargeMapper;
import com.atmatrix.abr.infrastructure.entity.ContractRecharge;
import com.atmatrix.abr.mgt.ContractRechargeMgt;
import com.atmatrix.abr.mgt.dto.ContractRechargeDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRechargeMgt
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-27 4:52 PM
 **/

@Component
public class ContractRechargeMgtImpl implements ContractRechargeMgt {


    @Autowired
    private ContractRechargeMapper rechargeMapper;

    @Override
    public void saveRecharge(ContractRechargeDto dto) {
        ContractRecharge toInsert = new ContractRecharge();
        BeanUtils.copyProperties(dto, toInsert);
        rechargeMapper.insert(toInsert);
    }
}
