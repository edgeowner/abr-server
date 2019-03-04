package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.ExceRobot;
import com.atmatrix.abr.infrastructure.entity.ExceRobotExample;
import com.atmatrix.abr.infrastructure.entity.ExceRobotWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExceRobotMapper {
    long countByExample(ExceRobotExample example);

    int deleteByExample(ExceRobotExample example);

    int insert(ExceRobotWithBLOBs record);

    int insertSelective(ExceRobotWithBLOBs record);

    List<ExceRobotWithBLOBs> selectByExampleWithBLOBs(ExceRobotExample example);

    List<ExceRobot> selectByExample(ExceRobotExample example);

    int updateByExampleSelective(@Param("record") ExceRobotWithBLOBs record, @Param("example") ExceRobotExample example);

    int updateByExampleWithBLOBs(@Param("record") ExceRobotWithBLOBs record, @Param("example") ExceRobotExample example);

    int updateByExample(@Param("record") ExceRobot record, @Param("example") ExceRobotExample example);
}