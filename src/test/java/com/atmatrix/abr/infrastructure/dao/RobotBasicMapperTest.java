package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotBasic;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class RobotBasicMapperTest extends BaseTest{

    @Autowired
    private RobotBasicMapper robotBasicMapper;

    @Test
    public void insert() {
        RobotBasic robotBasic = new RobotBasic();
        robotBasic.setAccountAddress("0x8e97296BF7a63f4A8644c92e83E4FCF48Ad4b37F");
        robotBasic.setDeviceId("404782845565632516");
        robotBasic.setRobotName("RobotName");
        robotBasic.setUnionCode("404782845565632516");
        robotBasic.setRobotPicUrl("");
        robotBasicMapper.insert(robotBasic);
    }
}