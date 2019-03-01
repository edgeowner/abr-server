package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.infrastructure.dao.ContractRentAddressMapper;
import com.atmatrix.abr.infrastructure.entity.ContractRentAddress;
import com.atmatrix.abr.infrastructure.entity.ContractRentAddressExample;
import com.atmatrix.abr.mgt.ContractRentAddressMgt;
import com.atmatrix.abr.mgt.dto.ContractRentAddressDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRentAddressMgtImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 6:42 PM
 **/

@Component
public class ContractRentAddressMgtImpl implements ContractRentAddressMgt {

    @Autowired
    private ContractRentAddressMapper contractRentMapper;


    @Override
    public void saveAddress(ContractRentAddressDto insert) {
        if (insert == null) return;
        ContractRentAddress toInsert = new ContractRentAddress();
        BeanUtils.copyProperties(insert, toInsert);
        contractRentMapper.insert(toInsert);
    }

    @Override
    public void updateAddress(ContractRentAddressDto update) {
        if (update == null) return;
        ContractRentAddress toUpdate = new ContractRentAddress();
        BeanUtils.copyProperties(update, toUpdate);
        ContractRentAddressExample example = new ContractRentAddressExample();
        ContractRentAddressExample.Criteria criteria = example.createCriteria();
        criteria.andRentUnionCodeEqualTo(update.getRentUnionCode());
        contractRentMapper.updateByExampleSelective(toUpdate, example);
    }
}
