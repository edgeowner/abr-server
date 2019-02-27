package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.ContractRent;
import com.atmatrix.abr.infrastructure.entity.ContractRentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRentMapper2
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-27 4:02 PM
 **/

public interface ContractRentMapper {
    long countByExample(ContractRentExample example);

    int deleteByExample(ContractRentExample example);

    int insert(ContractRent record);

    int insertSelective(ContractRent record);

    List<ContractRent> selectByExample(ContractRentExample example);

    int updateByExampleSelective(@Param("record") ContractRent record, @Param("example") ContractRentExample example);

    int updateByExample(@Param("record") ContractRent record, @Param("example") ContractRentExample example);

}
