package com.atmatrix.abr.infrastructure.dao;


import com.atmatrix.abr.mgt.dto.*;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRentExtendDao
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 6:31 PM
 **/

public interface ExceptionDao {
    List<RobotExceDto> queryEvaluationExceRobot(@Param("workType") String workType, @Param("exceCode") String exceCode);

    @MapKey("wokeType")
    Map<String, Integer> queryExceRobotAmountByWorkType(@Param("rentStatusCode") String rentStatus, @Param("exceCode") String exceCode);

    @MapKey("workType")
    Map<String, Integer> countExceRobotGroupByWorkType(@Param("exceCode")String exceCode);

    List<RobotPriceExceDto> queryPriceExceRobots(@Param("workType") String workTypeCode, @Param("exceCode") String exceCode);

    List<PriceStandardExDto> queryPriceStandardByWorkType();

    List<RobotExceOverdraftDto> queryOverdraftReference(@Param("exceCode") String exceCode);

    List<ExceRobotExtend> querySimpleExceRobots();
}
