package com.atmatrix.abr.mgt;

import com.atmatrix.abr.application.dto.PriceStandardDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.mgt.dto.ExceRobotExtend;
import com.atmatrix.abr.mgt.dto.PriceStandardExDto;
import com.atmatrix.abr.mgt.dto.RobotExceDto;
import com.atmatrix.abr.mgt.dto.RobotPriceExceDto;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: ExceRobotMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 5:47 PM
 **/

public interface ExceRobotMgt {

    /**
     * 分页获取异常机器人列表
     *
     * @return
     */
    List<RobotExceDto> queryExceptionRobots(PageQuery page, String workType);

    /**
     * 按照工作类型分组获取异常机器数量
     *
     * @return
     */
    Map<String, Integer> getExceptionGroupByWorkType(String rentStatus, String exceTypeCode);

    /**
     *  获取定价调整异常机器人列表
     * @param pageQuery
     * @param workTypeCode
     * @return
     */
    List<RobotPriceExceDto> queryPriceExceRobots(PageQuery pageQuery, String workTypeCode);


    /**
     *
     * @param pageQuery
     * @return
     */
    List<PriceStandardDto> queryStandardGroupByWorkType(PageQuery pageQuery);


    Map<String, Integer> getExceAmountGroupByWorkType(String exceTypeCode);


    List<ExceRobotExtend> queryExceRobotPage(PageQuery cond);
}
