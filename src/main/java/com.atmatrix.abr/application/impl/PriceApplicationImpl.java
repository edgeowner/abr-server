package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.PriceApplication;
import com.atmatrix.abr.application.dto.PriceStandardDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.evaluation.RobotEvaluationExceDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.common.constants.ExceTypeEnum;
import com.atmatrix.abr.common.constants.RentStatusEnum;
import com.atmatrix.abr.mgt.ExceRobotMgt;
import com.atmatrix.abr.mgt.PriceMgt;
import com.atmatrix.abr.mgt.RobotDetailMgt;
import com.atmatrix.abr.mgt.RobotOverdraftMgt;
import com.atmatrix.abr.mgt.dto.RobotPriceExceDto;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: PriceApplicationImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-01 5:02 PM
 **/

@Service
public class PriceApplicationImpl implements PriceApplication {


    @Autowired
    private PriceMgt priceMgt;

    @Autowired
    private RobotDetailMgt robotDetailMgt;

    @Autowired
    private ExceRobotMgt exceRobotMgt;

    @Autowired
    private RobotOverdraftMgt overdraftMgt;

    @Override
    public PageInfoResult<PriceStandardDto> getStandardGroupByWorkType(QueryCondPageDto cond) {
        if (cond == null) {
            return PageInfoResult.buildPage();
        }
        PageQuery pageQuery = cond.getPageQuery();
        List<PriceStandardDto> result = Lists.newArrayList();

        //查询绩效平均水平 按照工中分组
        List<PriceStandardDto> resource = priceMgt.queryStandardGroupByWorkType(pageQuery);
        //机器按工作类型统计
        Map<String, Integer> workTypeMap = exceRobotMgt.getExceAmountGroupByWorkType(ExceTypeEnum.PRICE.getCode());
        //异常机器按工作类型统计
        Map<String, Integer> exceptionMap = exceRobotMgt.getExceptionGroupByWorkType(RentStatusEnum.RENT.getCode(), ExceTypeEnum.PRICE.getCode());
        resource.stream().forEach(e -> {
            PriceStandardDto toAdd = new PriceStandardDto();
            BeanUtils.copyProperties(e, toAdd);
            toAdd.setRobotAmount(workTypeMap.get(e.getWorkTypeCode()));
            if (exceptionMap != null && exceptionMap.get(e.getWorkTypeCode()).compareTo(0) > 0) {
                toAdd.setHasExceRobot(true);
            } else {
                toAdd.setHasExceRobot(false);
            }
            result.add(toAdd);
        });
        return PageInfoResult.buildPageFromList(result);
    }

    @Override
    public PageInfoResult<RobotPriceExceDto> getPriceExceRobot(WorkTypeCondDto cond) {
        if (cond == null) {
            return PageInfoResult.buildPage();
        }
        PageQuery pageQuery = cond.getPageQuery();
        List<RobotEvaluationExceDto> result = Lists.newArrayList();
        if (StringUtils.isEmpty(cond.getWorkTypeCode())) {
            return PageInfoResult.buildPageFromList(result);
        }
        List<RobotPriceExceDto> resource = exceRobotMgt.queryPriceExceRobots(pageQuery, cond.getWorkTypeCode());
        resource.stream().forEach(e -> {
            RobotEvaluationExceDto toAdd = new RobotEvaluationExceDto();
            BeanUtils.copyProperties(e, toAdd);
            result.add(toAdd);
        });
        return PageInfoResult.buildPageFromList(result);
    }



}
