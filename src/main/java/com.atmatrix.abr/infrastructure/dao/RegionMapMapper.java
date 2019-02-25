package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RegionMap;
import com.atmatrix.abr.infrastructure.entity.RegionMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegionMapMapper {
    long countByExample(RegionMapExample example);

    int deleteByExample(RegionMapExample example);

    int insert(RegionMap record);

    int insertSelective(RegionMap record);

    int updateByExampleSelective(@Param("record") RegionMap record, @Param("example") RegionMapExample example);

    int updateByExample(@Param("record") RegionMap record, @Param("example") RegionMapExample example);

    List<RegionMap> getAll();
}