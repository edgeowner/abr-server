package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.mgt.dto.RobotConditionDto;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotExtenDao
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-25 4:02 PM
 **/

public interface RobotExtendDao {
    List<RobotDetailDto> queryListByPageCondition(@Param("conditions") RobotConditionDto robotConditionDto);


    RobotDetailExtendDto queryDetailInfoByUnionCode(@Param("robotUnionCode") String unionCode);

}
