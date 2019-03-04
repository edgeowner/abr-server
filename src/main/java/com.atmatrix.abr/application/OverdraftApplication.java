package com.atmatrix.abr.application;

import com.atmatrix.abr.application.dto.BillingOverdraftDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.mgt.dto.OverdraftDto;

/**
 * @ProjectName: abr-server
 * @ClassName: OverdraftApplication
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 2:07 PM
 **/

public interface OverdraftApplication {

    PageInfoResult<OverdraftDto> getRobotBalanceInfo(QueryCondPageDto cond);

    void adjustBillingPrice(WorkTypeCondDto cond);

    BillingOverdraftDto getOverdraftInfo(String rentUnionCode);
}
