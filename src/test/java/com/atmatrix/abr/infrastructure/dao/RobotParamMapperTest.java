package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.RobotParam;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;


public class RobotParamMapperTest extends BaseTest{

    @Autowired
    private RobotParamMapper robotParamMapper;

    @Test
    public void insert() {
        String robotUnionCode = "404877503672172540";
        RobotParam r1 = new RobotParam();
        RobotParam r2 = new RobotParam();
        RobotParam r3 = new RobotParam();
        RobotParam r4 = new RobotParam();
        RobotParam r5 = new RobotParam();
        RobotParam r6 = new RobotParam();
        RobotParam r7 = new RobotParam();
        RobotParam r8 = new RobotParam();
        RobotParam r9 = new RobotParam();
        RobotParam r10 = new RobotParam();
        RobotParam r11 = new RobotParam();
        RobotParam r12 = new RobotParam();
        RobotParam r13 = new RobotParam();


        r1.setKey("尺寸");
        r1.setValue("398*208*122mm");

        r2.setKey("重量");
        r2.setValue("1.65KG");

        r3.setKey("颜色");
        r3.setValue("白色");

        r4.setKey("材质");
        r4.setValue("铝合金结构,ABS外壳");

        r5.setKey("自由度");
        r5.setValue("16个自由度");

        r6.setKey("扬声器");
        r6.setValue("3W单声道");

        r7.setKey("处理器");
        r7.setValue("STM32-F103RDT6");

        r8.setKey("内部存储");
        r8.setValue("标配1.28M，最大可支持32G");

        r9.setKey("控制方式");
        r9.setValue("双模蓝牙Bluetooth3.0/4.0 BLE+EDR");

        r10.setKey("电 池");
        r10.setValue("7.4v 2050mAh锂电池");

        r11.setKey("续航能力");
        r11.setValue(">60 min/次");

        r12.setKey("系统兼容");
        r12.setValue("强大的兼容系统 （iOS/Android/PC）均可操作");

        r13.setKey("软件编程");
        r13.setValue("3D可视化基础上实现仿真模拟");


        r1.setRobotUnionCode(robotUnionCode);
        r2.setRobotUnionCode(robotUnionCode);
        r3.setRobotUnionCode(robotUnionCode);
        r4.setRobotUnionCode(robotUnionCode);
        r5.setRobotUnionCode(robotUnionCode);
        r6.setRobotUnionCode(robotUnionCode);
        r7.setRobotUnionCode(robotUnionCode);
        r8.setRobotUnionCode(robotUnionCode);
        r9.setRobotUnionCode(robotUnionCode);
        r10.setRobotUnionCode(robotUnionCode);
        r11.setRobotUnionCode(robotUnionCode);
        r12.setRobotUnionCode(robotUnionCode);
        r13.setRobotUnionCode(robotUnionCode);

        List<RobotParam> list = Lists.newArrayList();
        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        list.add(r5);
        list.add(r6);
        list.add(r7);
        list.add(r8);
        list.add(r9);
        list.add(r10);
        list.add(r11);
        list.add(r12);
        list.add(r13);
        robotParamMapper.batchInsert(list);
    }
}