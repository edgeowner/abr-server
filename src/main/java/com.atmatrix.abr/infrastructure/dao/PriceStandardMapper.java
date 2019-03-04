package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.PriceStandard;
import com.atmatrix.abr.infrastructure.entity.PriceStandardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PriceStandardMapper {
    long countByExample(PriceStandardExample example);

    int deleteByExample(PriceStandardExample example);

    int insert(PriceStandard record);

    int insertSelective(PriceStandard record);

    List<PriceStandard> selectByExample(PriceStandardExample example);

    int updateByExampleSelective(@Param("record") PriceStandard record, @Param("example") PriceStandardExample example);

    int updateByExample(@Param("record") PriceStandard record, @Param("example") PriceStandardExample example);
}