package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.RobotApplication;
import com.atmatrix.abr.application.dto.ExceRobotDto;
import com.atmatrix.abr.application.dto.ExceRobotInfoDto;
import com.atmatrix.abr.application.dto.ParamDto;
import com.atmatrix.abr.application.dto.RobotInfoDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondDicDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondExceDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.RegionCondDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.common.BizException;
import com.atmatrix.abr.common.constants.ExceTypeEnum;
import com.atmatrix.abr.infrastructure.entity.BillingPriceScope;
import com.atmatrix.abr.infrastructure.entity.RobotParam;
import com.atmatrix.abr.mgt.*;
import com.atmatrix.abr.mgt.dto.*;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ProjectName: abr-server
 * @ClassName: RobotApplicationImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 2:14 PM
 **/

@Service
public class RobotApplicationImpl implements RobotApplication {


    @Autowired
    private RobotDetailMgt robotDetailMgt;

    @Autowired
    private BillingMgt billingMgt;

    @Autowired
    private RobotParamMgt robotParamsMgt;

    @Autowired
    private DictionaryMgt dictionaryMgt;

    @Autowired
    private ExceRobotMgt exceRobotMgt;


    public PageInfoResult<RobotDetailDto> getRobotDetailPageList(QueryCondDicDto queryDto) {
        if (queryDto == null) {
            return PageInfoResult.buildPage();
        }
        PageQuery pageQuery = queryDto.getPage();
        RobotConditionDto robotConditionDto = buildRobotConditionDto(queryDto);
        PageInfoResult<RobotDetailDto> result = robotDetailMgt.getDictionaryListByPageDto(robotConditionDto, pageQuery);
        return result;
    }


    private RobotConditionDto buildRobotConditionDto(QueryCondDicDto params) {
        RobotConditionDto result = new RobotConditionDto();
        if (!StringUtils.isEmpty(params.getBillingPriceCode())) {
            BillingPriceScope billingPriceScope = billingMgt.getBillPriceByCode(params.getBillingPriceCode());
            if (billingPriceScope == null || !billingPriceScope.getParentUnionCode().equals(params.getBillingTypeCode())) {
                throw new BizException("所选价格范围不正确");
            }
            result.setMax(billingPriceScope.getMaxPrice());
            result.setMin(billingPriceScope.getMinPrice());
        }
        RegionCondDto regionCondDto = params.getRegionCondDto();
        String regionCode = null;
        if (regionCondDto == null || StringUtils.isEmpty(regionCondDto.getChildCode()) || StringUtils.isEmpty(regionCondDto.getCode())) {
            result.setLike(false);
        } else {
            if (regionCondDto.getChildCode().equals(regionCondDto.getCode())) {
                regionCode = regionCondDto.getCode();
                result.setLike(true);
            } else {
                regionCode = regionCondDto.getCode().concat(",").concat(regionCondDto.getChildCode());
                result.setLike(false);
            }
        }
        result.setRegionCode(regionCode);
        result.setBillingTypeCode(params.getBillingTypeCode());
        result.setRegionCode(params.getRentStatus());
        result.setWorkTypes(params.getWorkTypeCodes());
        return result;
    }

    @Override
    public RobotInfoDto getRobotDetailExntendInfo(String robotUnionCode) {
        RobotInfoDto result = new RobotInfoDto();
        RobotDetailExtendDto robotDetailInfo = robotDetailMgt.getRobotDetailInfo(robotUnionCode);
        if (robotDetailInfo == null) {
            return result;
        }
        BeanUtils.copyProperties(robotDetailInfo, result);
        handlerButtonStatus(robotDetailInfo, result);
        List<ParamDto> paramDtos = result.getParams();
        List<RobotParam> robotParamResources = robotParamsMgt.getRobotParamListByCode(robotUnionCode);
        robotParamResources.stream().forEach(e -> {
            ParamDto paramDto = new ParamDto();
            paramDto.setValue(e.getValue());
            paramDto.setKey(e.getKey());
            paramDtos.add(paramDto);
        });
        result.setParams(paramDtos);
        List<BillingTypeDto> billingTypeList = dictionaryMgt.getBillingTypes();
        result.setBillingTypes(billingTypeList);
        return result;
    }

    @Override
    public PageInfoResult<ExceRobotDto> getExceRobotList(QueryCondPageDto cond) {
        List<ExceRobotDto> list = Lists.newArrayList();

        List<ExceRobotExtend> resource = exceRobotMgt.queryExceRobotPage(cond.getPageQuery());
        resource.stream().forEach(e -> {
            ExceRobotDto toAdd = new ExceRobotDto();
            BeanUtils.copyProperties(e, toAdd);
            list.add(toAdd);
        });
        return PageInfoResult.buildPageFromList(list);
    }

    @Override
    public ExceRobotInfoDto getExceRobotInfo(QueryCondExceDto cond) {

        if (cond == null
                || StringUtils.isEmpty(cond.getRentUnionCode())
                || StringUtils.isEmpty(cond.getRobotUnionCode())
                || StringUtils.isEmpty(cond.getExceTypeCode())) {
            throw new BizException("字段不能为空");
        }
        ExceRobotInfoDto result = new ExceRobotInfoDto();
        String robotUnionCode = cond.getRobotUnionCode();
        String rentUnionCode = cond.getRentUnionCode();
        RobotCommonInfoDto commontInfo = robotDetailMgt.getExceCommonRobotInfo(robotUnionCode, rentUnionCode);
        if (commontInfo == null) {
            return result;
        }
        Map<String, String> mapKeyValue = new HashMap<>();
        BeanUtils.copyProperties(commontInfo, result);
        String exceTypeCode = commontInfo.getExceTypeCode();
        if (StringUtils.isEmpty(exceTypeCode)) {
            return result;
        } else if (ExceTypeEnum.EVALUATION.getCode().equals(exceTypeCode)) {

        } else if (ExceTypeEnum.PRICE.getCode().equals(exceTypeCode)) {

        } else if (ExceTypeEnum.BILLING.getCode().equals(exceTypeCode)) {

        } else if (ExceTypeEnum.OVERDRAFT.getCode().equals(exceTypeCode)) {

        }
        return result;
    }


    private void handlerButtonStatus(RobotDetailExtendDto robotDetailInfo, RobotInfoDto result) {
        if (robotDetailInfo == null) {

        }
//        result.setCanRent();
//        result.setCanAdjustPrice();
//        result.setCanRecharge();
//        result.setStartOrStop();
    }
}
