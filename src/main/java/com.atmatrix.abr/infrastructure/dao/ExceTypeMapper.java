package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.ExceType;
import com.atmatrix.abr.infrastructure.entity.ExceTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExceTypeMapper {

    long countByExample(ExceTypeExample example);

    int deleteByExample(ExceTypeExample example);

    int insert(ExceType record);

    int insertSelective(ExceType record);

    List<ExceType> selectByExample(ExceTypeExample example);

    int updateByExampleSelective(@Param("record") ExceType record, @Param("example") ExceTypeExample example);

    int updateByExample(@Param("record") ExceType record, @Param("example") ExceTypeExample example);
}