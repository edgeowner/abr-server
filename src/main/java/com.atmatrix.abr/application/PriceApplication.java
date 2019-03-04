package com.atmatrix.abr.application;

import com.atmatrix.abr.application.dto.PriceStandardDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.mgt.dto.RobotPriceExceDto;

/**
 * @ProjectName: abr-server
 * @ClassName: PriceApplication
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-01 5:01 PM
 **/

public interface PriceApplication {

    PageInfoResult<PriceStandardDto> getStandardGroupByWorkType(QueryCondPageDto cond);

    PageInfoResult<RobotPriceExceDto> getPriceExceRobot(WorkTypeCondDto cond);


}
