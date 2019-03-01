package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.mgt.dto.ContractRentExtendDto;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRentExtendDao
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 6:31 PM
 **/

public interface ContractRentExtendDao {
    ContractRentExtendDto queryByRobotUnionCode(@Param("robotUnionCode") String robotUnionCode);
}
