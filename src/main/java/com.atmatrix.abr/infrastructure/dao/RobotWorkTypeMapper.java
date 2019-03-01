package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.WorkType;
import com.atmatrix.abr.infrastructure.entity.WorkTypeExample;
import com.atmatrix.abr.infrastructure.entity.WorkTypeWithBLOBs;

import java.util.List;

import com.atmatrix.abr.mgt.dto.RobotWorkTypeDto;
import org.apache.ibatis.annotations.Param;

public interface RobotWorkTypeMapper {
    long countByExample(WorkTypeExample example);

    int deleteByExample(WorkTypeExample example);

    int insert(WorkTypeWithBLOBs record);

    int insertSelective(WorkTypeWithBLOBs record);

    List<WorkTypeWithBLOBs> selectByExampleWithBLOBs(WorkTypeExample example);

    List<WorkType> selectByExample(WorkTypeExample example);

    int updateByExampleSelective(@Param("record") WorkTypeWithBLOBs record, @Param("example") WorkTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkTypeWithBLOBs record, @Param("example") WorkTypeExample example);

    int updateByExample(@Param("record") WorkType record, @Param("example") WorkTypeExample example);

    List<WorkType> getAll();

    List<RobotWorkTypeDto> queryWorkTypeDto();
}