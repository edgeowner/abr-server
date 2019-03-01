package com.atmatrix.abr.infrastructure.dao;

import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.Assert.*;

public class RobotExtendDaoTest extends BaseTest{

    @Autowired
    private RobotExtendDao extendDao;

    @Test
    public void countRentRobotGroupByWorkType() {
        Map<String, Integer> stringObjectMap = extendDao.countRentRobotGroupByWorkType("1");
        System.out.println(new Gson().toJson(stringObjectMap));
    }
}