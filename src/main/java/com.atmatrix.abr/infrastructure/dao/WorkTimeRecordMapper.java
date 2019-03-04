package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.WorkTimeRecord;
import com.atmatrix.abr.infrastructure.entity.WorkTimeRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkTimeRecordMapper {
    long countByExample(WorkTimeRecordExample example);

    int deleteByExample(WorkTimeRecordExample example);

    int insert(WorkTimeRecord record);

    int insertSelective(WorkTimeRecord record);

    List<WorkTimeRecord> selectByExample(WorkTimeRecordExample example);

    int updateByExampleSelective(@Param("record") WorkTimeRecord record, @Param("example") WorkTimeRecordExample example);

    int updateByExample(@Param("record") WorkTimeRecord record, @Param("example") WorkTimeRecordExample example);
}