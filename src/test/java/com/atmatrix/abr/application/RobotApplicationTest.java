package com.atmatrix.abr.application;

import com.atmatrix.abr.infrastructure.dao.BaseTest;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class RobotApplicationTest extends BaseTest {


    @Autowired
    private RobotApplication robotApplication;

    @Test
    public void getRobotDetailExntendInfo() {
        String unionCode = "";
        RobotDetailExtendDto result = robotApplication.getRobotDetailExntendInfo(unionCode);
        System.out.println(new Gson().toJson(result));
    }
}