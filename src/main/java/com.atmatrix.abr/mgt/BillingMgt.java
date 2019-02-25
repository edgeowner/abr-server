package com.atmatrix.abr.mgt;

import com.atmatrix.abr.infrastructure.entity.BillingPrice;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingMgt
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 8:45 PM
 **/

public interface BillingMgt {

    List<BillingPrice> getBillPriceByParentCode(List<String> parentCodeList);

    BillingPrice getBillPriceByCode(String code);
}
