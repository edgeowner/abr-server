package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotDetail;
import com.atmatrix.abr.infrastructure.entity.RobotDetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RobotDetailMapper {
    long countByExample(RobotDetailExample example);

    int deleteByExample(RobotDetailExample example);

    int insert(RobotDetail record);

    int insertSelective(RobotDetail record);

    List<RobotDetail> selectByExample(RobotDetailExample example);

    int updateByExampleSelective(@Param("record") RobotDetail record, @Param("example") RobotDetailExample example);

    int updateByExample(@Param("record") RobotDetail record, @Param("example") RobotDetailExample example);



}
