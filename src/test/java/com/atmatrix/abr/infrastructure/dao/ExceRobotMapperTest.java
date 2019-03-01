package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.common.constants.RentStatusEnum;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.Assert.*;

public class ExceRobotMapperTest extends BaseTest{

    @Autowired
    private ExceRobotMapper exceRobotMapper;

    @Test
    public void queryExceRobotAmountByWorkType() {
        String rentStatus = RentStatusEnum.RENT.getCode();
        Map<String, Integer> stringIntegerMap = exceRobotMapper.queryExceRobotAmountByWorkType(rentStatus);
        System.out.println(new Gson().toJson(stringIntegerMap));

    }
}