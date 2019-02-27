package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.atmatrix.abr.infrastructure.entity.RobotDictionaryExample;
import com.atmatrix.abr.mgt.dto.BillingTypeDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RobotDictionaryMapper {
    long countByExample(RobotDictionaryExample example);

    int deleteByExample(RobotDictionaryExample example);

    int insert(RobotDictionary record);

    int insertSelective(RobotDictionary record);

    List<RobotDictionary> selectByExample(RobotDictionaryExample example);

    int updateByExampleSelective(@Param("record") RobotDictionary record, @Param("example") RobotDictionaryExample example);

    int updateByExample(@Param("record") RobotDictionary record, @Param("example") RobotDictionaryExample example);

    List<RobotDictionary> getAll();

    List<RobotDictionary> getListByTypes(@Param("list") List<String> types);

    void batchInsert(@Param("list") List<RobotDictionary> list);

    List<RobotDictionary> getListByType(@Param("type")String type);

    List<BillingTypeDto> getBillingTypeList();
}