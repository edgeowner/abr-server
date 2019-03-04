package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.application.dto.PriceStandardDto;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.common.constants.ExceTypeEnum;
import com.atmatrix.abr.infrastructure.dao.ExceptionDao;
import com.atmatrix.abr.mgt.ExceRobotMgt;
import com.atmatrix.abr.mgt.dto.ExceRobotExtend;
import com.atmatrix.abr.mgt.dto.PriceStandardExDto;
import com.atmatrix.abr.mgt.dto.RobotExceDto;
import com.atmatrix.abr.mgt.dto.RobotPriceExceDto;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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
    private ExceptionDao exceptionDao;

    @Override
    public List<RobotExceDto> queryExceptionRobots(PageQuery page, String workType) {
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        List<RobotExceDto> result = exceptionDao.queryEvaluationExceRobot(workType, ExceTypeEnum.EVALUATION.getCode());
        return result;
    }

    @Override
    public Map<String, Integer> getExceptionGroupByWorkType(String rentStatus, String exceTypeCode) {
        return exceptionDao.queryExceRobotAmountByWorkType(rentStatus, exceTypeCode);
    }

    @Override
    public List<RobotPriceExceDto> queryPriceExceRobots(PageQuery page, String workTypeCode) {
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        List<RobotPriceExceDto> result = exceptionDao.queryPriceExceRobots(workTypeCode,ExceTypeEnum.PRICE.getCode());
        return result;
    }


    @Override
    public List<PriceStandardDto> queryStandardGroupByWorkType(PageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());
        List<PriceStandardExDto> resource = exceptionDao.queryPriceStandardByWorkType();
        List<PriceStandardDto> result = Lists.newArrayList();
        for (PriceStandardExDto exDto:resource) {
            PriceStandardDto toAdd = new PriceStandardDto();
            BeanUtils.copyProperties(exDto,toAdd);
            result.add(toAdd);
        }
        return result;
    }

    @Override
    public Map<String, Integer> getExceAmountGroupByWorkType(String exceTypeCode) {
        return exceptionDao.countExceRobotGroupByWorkType(exceTypeCode);
    }

    @Override
    public List<ExceRobotExtend> queryExceRobotPage(PageQuery page) {
        if (page == null) {
            return new ArrayList<>();
        }
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        List<ExceRobotExtend> result = exceptionDao.querySimpleExceRobots();
        return result;
    }
}
