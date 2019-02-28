package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.RobotApplication;
import com.atmatrix.abr.application.dto.ParamDto;
import com.atmatrix.abr.application.dto.RobotInfoDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDicDto;
import com.atmatrix.abr.application.dto.condtion.RegionConditionDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.common.BizException;
import com.atmatrix.abr.infrastructure.entity.BillingPrice;
import com.atmatrix.abr.infrastructure.entity.RobotParam;
import com.atmatrix.abr.mgt.*;
import com.atmatrix.abr.mgt.dto.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;


/**
 * @ProjectName: abr-server
 * @ClassName: RobotApplicationImpl
 * @Description: TODO
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


    public PageInfoResult<RobotDetailDto> getRobotDetailPageList(QueryCondPageDicDto queryDto) {
        if (queryDto == null) {
            return PageInfoResult.buildPage();
        }

        PageQuery pageQuery = queryDto.getPage();
        RobotConditionDto robotConditionDto = buildRobotConditionDto(queryDto);
        PageInfoResult<RobotDetailDto> result = robotDetailMgt.getDictionaryListByPageDto(robotConditionDto, pageQuery);
        return result;
    }


    private RobotConditionDto buildRobotConditionDto(QueryCondPageDicDto params) {
        RobotConditionDto result = new RobotConditionDto();
        if (!StringUtils.isEmpty(params.getBillingPriceCode())) {
            BillingPrice billingPrice = billingMgt.getBillPriceByCode(params.getBillingPriceCode());
            if (billingPrice == null || !billingPrice.getParentUnionCode().equals(params.getBillingTypeCode())) {
                throw new BizException("所选价格范围不正确");
            }
            result.setMax(billingPrice.getMaxPrice());
            result.setMin(billingPrice.getMinPrice());
        }
        RegionConditionDto regionConditionDto = params.getRegionConditionDto();
        String regionCode = "";
        if (StringUtils.isEmpty(regionConditionDto.getChildCode()) || StringUtils.isEmpty(regionConditionDto.getCode())) {
            result.setLike(false);
        } else {
            if (regionConditionDto.getChildCode().equals(regionConditionDto.getCode())) {
                regionCode = regionConditionDto.getCode();
                result.setLike(true);
            } else {
                regionCode = regionConditionDto.getCode().concat(",").concat(regionConditionDto.getChildCode());
                result.setLike(false);
            }
        }
        result.setRegionCode(regionCode);
        result.setBillingTypeCode(params.getBillingTypeCode());
        result.setRentStatus(params.getRentStatus());
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


    private void handlerButtonStatus(RobotDetailExtendDto robotDetailInfo, RobotInfoDto result) {
        if (robotDetailInfo == null) {

        }
//        result.setCanRent();
//        result.setCanAdjustPrice();
//        result.setCanRecharge();
//        result.setStartOrStop();
    }
}
