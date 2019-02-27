package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.ContractRecharge;
import com.atmatrix.abr.infrastructure.entity.ContractRechargeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRechargeMapper
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-27 4:01 PM
 **/

public interface ContractRechargeMapper {
    long countByExample(ContractRechargeExample example);

    int deleteByExample(ContractRechargeExample example);

    int insert(ContractRecharge record);

    int insertSelective(ContractRecharge record);

    List<ContractRecharge> selectByExample(ContractRechargeExample example);

    int updateByExampleSelective(@Param("record") ContractRecharge record, @Param("example") ContractRechargeExample example);

    int updateByExample(@Param("record") ContractRecharge record, @Param("example") ContractRechargeExample example);

}
