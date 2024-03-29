package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.mgt.dto.RobotCommonInfoDto;
import com.atmatrix.abr.mgt.dto.RobotConditionDto;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotExtenDao
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-25 4:02 PM
 **/

public interface RobotExtendDao {

    List<RobotDetailDto> queryListByPageCondition(@Param("conditions") RobotConditionDto robotConditionDto);

    RobotDetailExtendDto queryDetailInfoByUnionCode(@Param("robotUnionCode") String unionCode);

    RobotDetailDto queryOneByUnionCode(@Param("unionCode") String unionCode);


    RobotCommonInfoDto queryExceCommonInfoByCodes(@Param("robotUnionCode") String robotUnionCode, @Param("rentUnionCode") String rentUnionCode);
}
