package com.atmatrix.abr.mgt;

import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.mgt.dto.RobotExceOverdraftDto;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotOverdraftMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-04 1:52 PM
 **/

public interface RobotOverdraftMgt {
    List<RobotExceOverdraftDto> queryRobotOverdraftInfo(PageQuery cond);
}
