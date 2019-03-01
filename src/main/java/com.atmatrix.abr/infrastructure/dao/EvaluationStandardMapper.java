package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.EvaluationStandard;
import com.atmatrix.abr.infrastructure.entity.EvaluationStandardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvaluationStandardMapper {
    long countByExample(EvaluationStandardExample example);

    int deleteByExample(EvaluationStandardExample example);

    int insert(EvaluationStandard record);

    int insertSelective(EvaluationStandard record);

    List<EvaluationStandard> selectByExample(EvaluationStandardExample example);

    int updateByExampleSelective(@Param("record") EvaluationStandard record, @Param("example") EvaluationStandardExample example);

    int updateByExample(@Param("record") EvaluationStandard record, @Param("example") EvaluationStandardExample example);
}