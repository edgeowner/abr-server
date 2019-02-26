package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.infrastructure.dao.BaseTest;
import com.atmatrix.abr.infrastructure.dao.RobotParamMapper;
import com.atmatrix.abr.infrastructure.entity.RobotParam;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class RobotParamMgtImplTest extends BaseTest {


    @Autowired
    private RobotParamMapper robotParamMapper;

    @Test
    public void getRobotParamListByCode() {
        String code = "404783011800760331";
        List<RobotParam> robotParams = robotParamMapper.queryParamsByUnionCode(code);
        System.out.println(new Gson().toJson(robotParams));
    }
}