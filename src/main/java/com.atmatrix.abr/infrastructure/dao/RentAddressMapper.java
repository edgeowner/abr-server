package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RentAddress;
import com.atmatrix.abr.infrastructure.entity.RentAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RentAddressMapper {
    long countByExample(RentAddressExample example);

    int deleteByExample(RentAddressExample example);

    int insert(RentAddress record);

    int insertSelective(RentAddress record);

    List<RentAddress> selectByExample(RentAddressExample example);

    int updateByExampleSelective(@Param("record") RentAddress record, @Param("example") RentAddressExample example);

    int updateByExample(@Param("record") RentAddress record, @Param("example") RentAddressExample example);
}