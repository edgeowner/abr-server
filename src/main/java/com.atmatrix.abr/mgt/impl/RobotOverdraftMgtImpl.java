package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.common.constants.ExceTypeEnum;
import com.atmatrix.abr.infrastructure.dao.ExceptionDao;
import com.atmatrix.abr.mgt.RobotOverdraftMgt;
import com.atmatrix.abr.mgt.dto.RobotExceOverdraftDto;
import com.atmatrix.abr.mgt.dto.RobotOverdraftDto;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotOverdraftMgtImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-04 1:53 PM
 **/

@Component
public class RobotOverdraftMgtImpl implements RobotOverdraftMgt {

    @Autowired
    private ExceptionDao exceptionDao;


    @Override
    public List<RobotExceOverdraftDto> queryRobotOverdraftInfo(PageQuery page) {
        if (page == null) {
            return Lists.newArrayList();
        }
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        List<RobotExceOverdraftDto> result = exceptionDao.queryOverdraftReference(ExceTypeEnum.BILLING.getCode());
        return result;
    }




}
