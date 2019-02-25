package com.atmatrix.abr.mgt.impl;


import com.atmatrix.abr.infrastructure.dao.RobotParamMapper;
import com.atmatrix.abr.infrastructure.entity.RobotParam;
import com.atmatrix.abr.mgt.RobotParamMgt;
import com.atmatrix.abr.mgt.dto.RobotParamsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotParamsMgtImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-25 5:16 PM
 **/

@Component
public class RobotParamMgtImpl implements RobotParamMgt {

    @Autowired
    private RobotParamMapper robotParamMapper;

    public List<RobotParam> getRobotParamListByCode(String robotUnionCode) {
        return robotParamMapper.queryParamsByUnionCode(robotUnionCode);
    }
}
