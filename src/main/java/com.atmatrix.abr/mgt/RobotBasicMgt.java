package com.atmatrix.abr.mgt;

import com.atmatrix.abr.mgt.dto.RobotBasicDto;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotBasicMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 4:22 PM
 **/

public interface RobotBasicMgt {


    RobotBasicDto queryRobotBasicByUnionCode(String unionCode);
}
