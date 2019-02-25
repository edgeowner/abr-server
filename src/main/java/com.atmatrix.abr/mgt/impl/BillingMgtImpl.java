package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.infrastructure.dao.BillingPriceMapper;
import com.atmatrix.abr.infrastructure.entity.BillingPrice;
import com.atmatrix.abr.mgt.BillingMgt;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingMgtImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 8:45 PM
 **/

@Component
public class BillingMgtImpl implements BillingMgt {

    @Autowired
    private BillingPriceMapper billingPriceMapper;

    @Override
    public List<BillingPrice> getBillPriceByParentCode(List<String> parentCodeList) {
        List<BillingPrice> result = billingPriceMapper.getBillingPriceByParentCode(parentCodeList);
        return result;
    }

    @Override
    public BillingPrice getBillPriceByCode(String code) {

        BillingPrice result = billingPriceMapper.getBillingPriceByCode(code);
        return result;
    }
}
