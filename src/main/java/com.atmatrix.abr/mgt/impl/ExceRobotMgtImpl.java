package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.infrastructure.dao.ExceRobotMapper;
import com.atmatrix.abr.infrastructure.dao.ExceptionDao;
import com.atmatrix.abr.mgt.ExceRobotMgt;
import com.atmatrix.abr.mgt.dto.RobotExceDto;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: ExceRobotMgtImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 7:32 PM
 **/

@Component
public class ExceRobotMgtImpl implements ExceRobotMgt {


    @Autowired
    private ExceRobotMapper exceRobotMapper;

    @Autowired
    private ExceptionDao exceptionDao;

    @Override
    public List<RobotExceDto> queryExceptionRobots(PageQuery page, String workType) {
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        List<RobotExceDto> result = exceptionDao.queryEvaluationExceRobot(workType);
        return result;
    }

    @Override
    public Map<String, Integer> getExceptionGroupByWorkType(String rentStatus) {
        return exceRobotMapper.queryExceRobotAmountByWorkType(rentStatus);
    }
}
