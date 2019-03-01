package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotEvaluation;
import com.atmatrix.abr.infrastructure.entity.RobotEvaluationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RobotEvaluationMapper {
    long countByExample(RobotEvaluationExample example);

    int deleteByExample(RobotEvaluationExample example);

    int insert(RobotEvaluation record);

    int insertSelective(RobotEvaluation record);

    List<RobotEvaluation> selectByExample(RobotEvaluationExample example);

    int updateByExampleSelective(@Param("record") RobotEvaluation record, @Param("example") RobotEvaluationExample example);

    int updateByExample(@Param("record") RobotEvaluation record, @Param("example") RobotEvaluationExample example);
}