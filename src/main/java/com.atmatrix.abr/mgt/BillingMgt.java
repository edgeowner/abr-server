package com.atmatrix.abr.mgt;

import com.atmatrix.abr.infrastructure.entity.BillingPriceScope;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 8:45 PM
 **/

public interface BillingMgt {

    List<BillingPriceScope> getBillPriceByParentCode(List<String> parentCodeList);

    BillingPriceScope getBillPriceByCode(String code);

}
