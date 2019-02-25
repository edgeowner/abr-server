package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotParam;
import com.atmatrix.abr.infrastructure.entity.RobotParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotParamMapper
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-25 5:18 PM
 **/

public interface RobotParamMapper {
    long countByExample(RobotParamExample example);

    int deleteByExample(RobotParamExample example);

    int insert(RobotParam record);

    int insertSelective(RobotParam record);

    List<RobotParam> selectByExample(RobotParamExample example);

    int updateByExampleSelective(@Param("record") RobotParam record, @Param("example") RobotParamExample example);

    int updateByExample(@Param("record") RobotParam record, @Param("example") RobotParamExample example);

    List<RobotParam> queryParamsByUnionCode(@Param("robotUnionCode") String robotUnionCode);

    void batchInsert(@Param("list") List<RobotParam> list);
}
