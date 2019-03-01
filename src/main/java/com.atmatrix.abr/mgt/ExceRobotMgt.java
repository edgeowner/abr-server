package com.atmatrix.abr.mgt;

import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.mgt.dto.RobotExceDto;

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
    List<RobotExceDto> queryExceptionRobots(PageQuery page,String workType);

    /**
     * 按照工作类型分组获取异常机器数量
     *
     * @return
     */
    Map<String, Integer> getExceptionGroupByWorkType(String rentStatus);

}
