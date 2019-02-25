package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotWorktype;
import com.atmatrix.abr.infrastructure.entity.RobotWorktypeExample;
import com.atmatrix.abr.infrastructure.entity.RobotWorktypeWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotWorktypeMapper
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 7:01 PM
 **/

public interface RobotWorktypeMapper {

    long countByExample(RobotWorktypeExample example);

    int deleteByExample(RobotWorktypeExample example);

    int insert(RobotWorktypeWithBLOBs record);

    int insertSelective(RobotWorktypeWithBLOBs record);

    List<RobotWorktypeWithBLOBs> selectByExampleWithBLOBs(RobotWorktypeExample example);

    List<RobotWorktype> selectByExample(RobotWorktypeExample example);

    int updateByExampleSelective(@Param("record") RobotWorktypeWithBLOBs record, @Param("example") RobotWorktypeExample example);

    int updateByExampleWithBLOBs(@Param("record") RobotWorktypeWithBLOBs record, @Param("example") RobotWorktypeExample example);

    int updateByExample(@Param("record") RobotWorktype record, @Param("example") RobotWorktypeExample example);

    List<RobotWorktype> getAll();

}
