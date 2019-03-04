package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotProceeds;
import com.atmatrix.abr.infrastructure.entity.RobotProceedsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RobotProceedsMapper {
    long countByExample(RobotProceedsExample example);

    int deleteByExample(RobotProceedsExample example);

    int insert(RobotProceeds record);

    int insertSelective(RobotProceeds record);

    List<RobotProceeds> selectByExample(RobotProceedsExample example);

    int updateByExampleSelective(@Param("record") RobotProceeds record, @Param("example") RobotProceedsExample example);

    int updateByExample(@Param("record") RobotProceeds record, @Param("example") RobotProceedsExample example);
}