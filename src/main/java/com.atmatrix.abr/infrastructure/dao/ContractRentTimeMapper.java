package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.ContractRentTime;
import com.atmatrix.abr.infrastructure.entity.ContractRentTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractRentTimeMapper {
    long countByExample(ContractRentTimeExample example);

    int deleteByExample(ContractRentTimeExample example);

    int insert(ContractRentTime record);

    int insertSelective(ContractRentTime record);

    List<ContractRentTime> selectByExample(ContractRentTimeExample example);

    int updateByExampleSelective(@Param("record") ContractRentTime record, @Param("example") ContractRentTimeExample example);

    int updateByExample(@Param("record") ContractRentTime record, @Param("example") ContractRentTimeExample example);
}