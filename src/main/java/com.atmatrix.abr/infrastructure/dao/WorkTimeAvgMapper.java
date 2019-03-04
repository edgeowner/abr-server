package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.WorkTimeAvg;
import com.atmatrix.abr.infrastructure.entity.WorkTimeAvgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkTimeAvgMapper {
    long countByExample(WorkTimeAvgExample example);

    int deleteByExample(WorkTimeAvgExample example);

    int insert(WorkTimeAvg record);

    int insertSelective(WorkTimeAvg record);

    List<WorkTimeAvg> selectByExample(WorkTimeAvgExample example);

    int updateByExampleSelective(@Param("record") WorkTimeAvg record, @Param("example") WorkTimeAvgExample example);

    int updateByExample(@Param("record") WorkTimeAvg record, @Param("example") WorkTimeAvgExample example);
}