package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.ContractRentAddress;
import com.atmatrix.abr.infrastructure.entity.ContractRentAddressExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface ContractRentAddressMapper {
    long countByExample(ContractRentAddressExample example);

    int deleteByExample(ContractRentAddressExample example);

    int insert(ContractRentAddress record);

    int insertSelective(ContractRentAddress record);

    List<ContractRentAddress> selectByExample(ContractRentAddressExample example);

    int updateByExampleSelective(@Param("record") ContractRentAddress record, @Param("example") ContractRentAddressExample example);

    int updateByExample(@Param("record") ContractRentAddress record, @Param("example") ContractRentAddressExample example);
}