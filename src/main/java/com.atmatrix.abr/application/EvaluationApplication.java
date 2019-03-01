package com.atmatrix.abr.application;

import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.evaluation.EvaluationStandardDto;
import com.atmatrix.abr.application.dto.evaluation.RobotExceptionDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;

/**
 * @ProjectName: abr-server
 * @ClassName: EvaluationApplication
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 3:40 PM
 **/

public interface EvaluationApplication {

    /**
     * 按照工作类型获取绩效参考数据
     *
     * @param cond
     * @return
     */
    PageInfoResult<EvaluationStandardDto> getStandardGroupByWorkType(QueryCondPageDto cond);

    /**
     * 按照工作类型获取某一类型机器人的绩效数据
     *
     * @param cond
     * @return
     */
    PageInfoResult<RobotExceptionDto> getExceptionRobot(WorkTypeCondDto cond);



}
