package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.common.constants.DeleteEnum;
import com.atmatrix.abr.common.util.IdWorker;
import com.atmatrix.abr.infrastructure.entity.RobotDetail;
import com.atmatrix.abr.mgt.dto.RobotConditionDto;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class RobotDetailMapperTest extends BaseTest {


    @Autowired
    private RobotExtendDao robotExtendDao;
    @Autowired
    private RobotDetailMapper robotDetailMapper;

    @Test
    public void insert() {
        RobotDetail robotDetail = null;
        for (int i = 0; i < 7; i++) {
            robotDetail = new RobotDetail();
            robotDetail.setRobotName("test" + (i + 1) * 100);
            robotDetail.setRobotUnionCode(String.valueOf(IdWorker.getId()));
            robotDetail.setRegionCode("110000,120101");
            robotDetail.setRegionName("北京/和平区");
            if (i % 2 == 0) {
                robotDetail.setBillingType(String.valueOf(200));
            } else {
                robotDetail.setBillingType(String.valueOf(100));
            }
            robotDetail.setBillingPrice(356 + i * 100);
            robotDetail.setWorkType(String.valueOf(i * 1000));
            robotDetail.setRentStatusCode("1");
            robotDetail.setDelete(DeleteEnum.TRUE.getCode());
            robotDetailMapper.insert(robotDetail);
        }

    }

    @Test
    public void queryListByPageCondition() {
        RobotConditionDto robotConditionDto = new RobotConditionDto();
        List<String> list = Lists.newArrayList();
        list.add("6000");
        list.add("5000");

        robotConditionDto.setMax(900);
        robotConditionDto.setMin(400);
        robotConditionDto.setWorkTypes(list);
        robotConditionDto.setLike(true);
        robotConditionDto.setRentStatusCode("1");
        robotConditionDto.setRegionCode("110000");
        List<RobotDetailDto> robotDetailDtos = robotExtendDao.queryListByPageCondition(robotConditionDto);

        robotDetailDtos.stream().forEach(e -> {
            System.out.println(e.getId());
        });
    }
}