package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.common.BizException;
import com.atmatrix.abr.infrastructure.dao.RobotBasicMapper;
import com.atmatrix.abr.infrastructure.entity.RobotBasic;
import com.atmatrix.abr.mgt.RobotBasicMgt;
import com.atmatrix.abr.mgt.dto.RobotBasicDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotBasicMgtImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 4:22 PM
 **/

@Component
public class RobotBasicMgtImpl implements RobotBasicMgt {

    @Autowired
    private RobotBasicMapper robotBasicMapper;

    @Override
    public RobotBasicDto queryRobotBasicByUnionCode(String unionCode) {
        RobotBasicDto result = new RobotBasicDto();
        RobotBasic robotBasic = robotBasicMapper.queryRobotBasicByUnionCode(unionCode);
        if (robotBasic == null) {
            throw new BizException("不存在该机器");
        }
        BeanUtils.copyProperties(robotBasic, result);
        return result;
    }
}
