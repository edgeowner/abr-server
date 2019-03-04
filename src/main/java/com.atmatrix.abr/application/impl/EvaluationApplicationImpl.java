package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.EvaluationApplication;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.evaluation.EvaluationStandardDto;
import com.atmatrix.abr.application.dto.evaluation.RobotEvaluationExceDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.common.constants.ExceTypeEnum;
import com.atmatrix.abr.common.constants.RentStatusEnum;
import com.atmatrix.abr.mgt.EvaluationMgt;
import com.atmatrix.abr.mgt.ExceRobotMgt;
import com.atmatrix.abr.mgt.RobotDetailMgt;
import com.atmatrix.abr.mgt.dto.EvaluationStandardExtendDto;
import com.atmatrix.abr.mgt.dto.RobotExceDto;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: EvaluationApplicationImpl
 * @Description: 绩效异常 - 查询
 * @Author: edgeowner
 * @Create: 2019-02-28 3:40 PM
 **/


@Service
public class EvaluationApplicationImpl implements EvaluationApplication {


    @Autowired
    private EvaluationMgt evaluationMgt;

    @Autowired
    private RobotDetailMgt robotDetailMgt;

    @Autowired
    private ExceRobotMgt exceRobotMgt;


    /**
     * 查询异常工作类型列表统计数据
     *
     * @param cond
     * @return
     */
    @Override
    public PageInfoResult<EvaluationStandardDto> getStandardGroupByWorkType(QueryCondPageDto cond) {
        if (cond == null) {
            return PageInfoResult.buildPage();
        }
        PageQuery pageQuery = cond.getPageQuery();
        List<EvaluationStandardDto> result = Lists.newArrayList();

        //查询绩效平均水平 按照工中分组
        List<EvaluationStandardExtendDto> resource = evaluationMgt.queryStandardExtendGroupByWorkType(pageQuery);
        //机器按工作类型统计
        Map<String, Integer> workTypeMap = exceRobotMgt.getExceAmountGroupByWorkType(ExceTypeEnum.EVALUATION.getCode());
        //异常机器按工作类型统计
        Map<String, Integer> exceptionMap = exceRobotMgt.getExceptionGroupByWorkType(RentStatusEnum.RENT.getCode(), ExceTypeEnum.EVALUATION.getCode());
        resource.stream().forEach(e -> {
            EvaluationStandardDto toAdd = new EvaluationStandardDto();
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

    /**
     * 按照工作类型，查询异常设备列表
     *
     * @param cond
     * @return
     */
    @Override
    public PageInfoResult<RobotEvaluationExceDto> getExceptionRobot(WorkTypeCondDto cond) {
        if (cond == null) {
            return PageInfoResult.buildPage();
        }
        PageQuery pageQuery = cond.getPageQuery();
        List<RobotEvaluationExceDto> result = Lists.newArrayList();
        if (StringUtils.isEmpty(cond.getWorkTypeCode())) {
            return PageInfoResult.buildPageFromList(result);
        }
        List<RobotExceDto> resource = exceRobotMgt.queryExceptionRobots(pageQuery, cond.getWorkTypeCode());
        resource.stream().forEach(e -> {
            RobotEvaluationExceDto toAdd = new RobotEvaluationExceDto();
            BeanUtils.copyProperties(e, toAdd);
            result.add(toAdd);
        });
        return PageInfoResult.buildPageFromList(result);
    }


}
