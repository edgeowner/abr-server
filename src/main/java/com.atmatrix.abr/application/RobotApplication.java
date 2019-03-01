package com.atmatrix.abr.application;

import com.atmatrix.abr.application.dto.RobotInfoDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondDicDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;

/**
 * @ProjectName: abr-server
 * @ClassName: RebotApplication
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 2:14 PM
 **/

public interface RobotApplication {

    PageInfoResult<RobotDetailDto> getRobotDetailPageList(QueryCondDicDto queryPageDicConditionDto);

    RobotInfoDto getRobotDetailExntendInfo(String robotUnionCode);


}
