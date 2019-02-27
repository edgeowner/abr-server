package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotWorkType;
import com.atmatrix.abr.infrastructure.entity.RobotWorkTypeExample;
import com.atmatrix.abr.infrastructure.entity.RobotWorkTypeWithBLOBs;

import java.util.List;

import com.atmatrix.abr.mgt.dto.RobotWorkTypeDto;
import org.apache.ibatis.annotations.Param;

public interface RobotWorkTypeMapper {
    long countByExample(RobotWorkTypeExample example);

    int deleteByExample(RobotWorkTypeExample example);

    int insert(RobotWorkTypeWithBLOBs record);

    int insertSelective(RobotWorkTypeWithBLOBs record);

    List<RobotWorkTypeWithBLOBs> selectByExampleWithBLOBs(RobotWorkTypeExample example);

    List<RobotWorkType> selectByExample(RobotWorkTypeExample example);

    int updateByExampleSelective(@Param("record") RobotWorkTypeWithBLOBs record, @Param("example") RobotWorkTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") RobotWorkTypeWithBLOBs record, @Param("example") RobotWorkTypeExample example);

    int updateByExample(@Param("record") RobotWorkType record, @Param("example") RobotWorkTypeExample example);

    List<RobotWorkType> getAll();

    List<RobotWorkTypeDto> queryWorkTypeDto();
}