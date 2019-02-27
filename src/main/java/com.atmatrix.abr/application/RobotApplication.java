package com.atmatrix.abr.application;

import com.atmatrix.abr.application.dto.RobotInfoDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDicDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;

/**
 * @ProjectName: abr-server
 * @ClassName: RebotApplication
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 2:14 PM
 **/

public interface RobotApplication {

    PageInfoResult<RobotDetailDto> getRobotDetailPageList(QueryCondPageDicDto queryPageDicConditionDto);

    RobotInfoDto getRobotDetailExntendInfo(String robotUnionCode);


}
