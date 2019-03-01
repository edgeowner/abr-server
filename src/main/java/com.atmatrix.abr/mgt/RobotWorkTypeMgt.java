package com.atmatrix.abr.mgt;

import com.atmatrix.abr.mgt.dto.RobotWorkTypeDto;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotWorkTypeMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-26 3:43 PM
 **/

public interface RobotWorkTypeMgt {

    List<RobotWorkTypeDto> getRobotWorkTypeList();
}
