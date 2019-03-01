package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotBasic;
import com.atmatrix.abr.infrastructure.entity.RobotBasicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotBasicMapper2
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-25 4:39 PM
 **/

public interface RobotBasicMapper {
    long countByExample(RobotBasicExample example);

    int deleteByExample(RobotBasicExample example);

    int insert(RobotBasic record);

    int insertSelective(RobotBasic record);

    List<RobotBasic> selectByExample(RobotBasicExample example);

    int updateByExampleSelective(@Param("record") RobotBasic record, @Param("example") RobotBasicExample example);

    int updateByExample(@Param("record") RobotBasic record, @Param("example") RobotBasicExample example);

    RobotBasic queryRobotBasicByUnionCode(@Param("unionCode") String unionCode);
}
