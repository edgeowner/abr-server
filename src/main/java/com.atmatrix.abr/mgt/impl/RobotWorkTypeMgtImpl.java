package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.infrastructure.dao.RobotWorkTypeMapper;
import com.atmatrix.abr.mgt.RobotWorkTypeMgt;
import com.atmatrix.abr.mgt.dto.RobotWorkTypeDto;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotWorkTypeMgtImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-26 3:51 PM
 **/

@Component
public class RobotWorkTypeMgtImpl implements RobotWorkTypeMgt {


    @Autowired
    private RobotWorkTypeMapper robotWorkTypeMapper;

    @Override
    public List<RobotWorkTypeDto> getRobotWorkTypeList() {
        List<RobotWorkTypeDto> result = robotWorkTypeMapper.queryWorkTypeDto();
        return result;
    }
}
