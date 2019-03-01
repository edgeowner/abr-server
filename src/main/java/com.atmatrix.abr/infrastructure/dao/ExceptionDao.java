package com.atmatrix.abr.infrastructure.dao;


import com.atmatrix.abr.mgt.dto.RobotExceDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRentExtendDao
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 6:31 PM
 **/

public interface ExceptionDao {
    List<RobotExceDto> queryEvaluationExceRobot(@Param("workType") String workType);
}
