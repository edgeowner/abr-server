package com.atmatrix.abr.mgt;

import com.atmatrix.abr.infrastructure.entity.RobotParam;
import com.atmatrix.abr.mgt.dto.RobotParamsDto;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotParamsMgt
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-25 5:16 PM
 **/

public interface RobotParamMgt {
    List<RobotParam> getRobotParamListByCode(String robotUnionCode);
}
