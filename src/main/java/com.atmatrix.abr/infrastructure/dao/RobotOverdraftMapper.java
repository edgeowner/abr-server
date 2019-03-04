package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotOverdraft;
import com.atmatrix.abr.infrastructure.entity.RobotOverdraftExample;
import com.atmatrix.abr.infrastructure.entity.RobotOverdraftWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RobotOverdraftMapper {
    long countByExample(RobotOverdraftExample example);

    int deleteByExample(RobotOverdraftExample example);

    int insert(RobotOverdraftWithBLOBs record);

    int insertSelective(RobotOverdraftWithBLOBs record);

    List<RobotOverdraftWithBLOBs> selectByExampleWithBLOBs(RobotOverdraftExample example);

    List<RobotOverdraft> selectByExample(RobotOverdraftExample example);

    int updateByExampleSelective(@Param("record") RobotOverdraftWithBLOBs record, @Param("example") RobotOverdraftExample example);

    int updateByExampleWithBLOBs(@Param("record") RobotOverdraftWithBLOBs record, @Param("example") RobotOverdraftExample example);

    int updateByExample(@Param("record") RobotOverdraft record, @Param("example") RobotOverdraftExample example);
}