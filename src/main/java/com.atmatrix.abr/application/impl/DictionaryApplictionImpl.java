package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.DictionaryAppliction;
import com.atmatrix.abr.application.dto.BillingDto;
import com.atmatrix.abr.application.dto.BillingPriceDto;
import com.atmatrix.abr.application.dto.DictionaryDto;
import com.atmatrix.abr.common.constants.QueryDicTypeEnum;
import com.atmatrix.abr.infrastructure.entity.BillingPrice;
import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.atmatrix.abr.mgt.BillingMgt;
import com.atmatrix.abr.mgt.DictionaryMgt;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: abr-server
 * @ClassName: DictionaryApplictionImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-20 7:46 PM
 **/

@Service
public class DictionaryApplictionImpl implements DictionaryAppliction {

    @Autowired
    private DictionaryMgt dictionaryMgt;

    @Autowired
    private BillingMgt billingMgt;


    @Override
    public Map<String, List<DictionaryDto>> queryDicList() {

        List<RobotDictionary> resource = dictionaryMgt.getListDtoByTypeList();

        Map<String, List<DictionaryDto>> result = Maps.newHashMap();
        List<RobotDictionary> regionList = Lists.newArrayList();
        List<RobotDictionary> workTypeList = Lists.newArrayList();
        List<RobotDictionary> billingList = Lists.newArrayList();
        List<RobotDictionary> rentStatusList = Lists.newArrayList();
        for (RobotDictionary robotDictionary : resource) {
            if (robotDictionary.getType().equals(QueryDicTypeEnum.REGION.getName())) {
                regionList.add(robotDictionary);
            }
            if (robotDictionary.getType().equals(QueryDicTypeEnum.WORK_TYPE.getName())) {
                workTypeList.add(robotDictionary);
            }
            if (robotDictionary.getType().equals(QueryDicTypeEnum.BILLING.getName())) {
                billingList.add(robotDictionary);
            }
            if (robotDictionary.getType().equals(QueryDicTypeEnum.RENT_STATUS.getName())) {
                rentStatusList.add(robotDictionary);
            }
        }
        result.put(QueryDicTypeEnum.REGION.getName(), handlerParentChildrenResouceList(regionList));
        result.put(QueryDicTypeEnum.WORK_TYPE.getName(), handlerParentChildrenResouceList(workTypeList));
        result.put(QueryDicTypeEnum.BILLING.getName(), handlerParentChildrenResouceList(billingList));
        result.put(QueryDicTypeEnum.RENT_STATUS.getName(), handlerParentChildrenResouceList(rentStatusList));
        return result;
    }

    @Override
    public List<DictionaryDto> queryRegionList() {
        String region = QueryDicTypeEnum.REGION.getName();
        List<RobotDictionary> resource = dictionaryMgt.getListDtoByType(region);
        List<DictionaryDto> result = Lists.newArrayList();
        result.addAll(handlerParentChildrenResouceList(resource));
        return result;
    }

    @Override
    public List<DictionaryDto> queryWorkTypeList() {
        String workType = QueryDicTypeEnum.WORK_TYPE.getName();
        List<RobotDictionary> resource = dictionaryMgt.getListDtoByType(workType);
        List<DictionaryDto> result = Lists.newArrayList();
        result.addAll(handlerParentChildrenResouceList(resource));
        return result;
    }

    @Override
    public List<BillingDto> queryBillingList() {
        List<BillingDto> result = Lists.newArrayList();
        String billing = QueryDicTypeEnum.BILLING.getName();
        List<RobotDictionary> resource = dictionaryMgt.getListDtoByType(billing);
        List<String> billTypeCode = Lists.newArrayList();

        BillingDto billingDto = null;
        for (RobotDictionary robotDictionary : resource) {
            billingDto = new BillingDto();
            billingDto.setCode(robotDictionary.getCode());
            billingDto.setName(robotDictionary.getName());
            billingDto.setType(robotDictionary.getType());
            billTypeCode.add(robotDictionary.getCode());
            result.add(billingDto);
        }
        List<BillingPrice> billingPrices = billingMgt.getBillPriceByParentCode(billTypeCode);
        handlerBillingTypePriceDto(result, billingPrices);
        return result;
    }

    @Override
    public List<DictionaryDto> queryRentStatusList() {
        List<DictionaryDto> result = Lists.newArrayList();
        String statusType = QueryDicTypeEnum.RENT_STATUS.getName();
        List<RobotDictionary> listDtoByType = dictionaryMgt.getListDtoByType(statusType);
        listDtoByType.stream().forEach(e->{
            DictionaryDto dictionaryDto = new DictionaryDto();
            dictionaryDto.setCode(e.getCode());
            dictionaryDto.setName(e.getName());
            result.add(dictionaryDto);
        });
        return result;
    }


    private void handlerBillingTypePriceDto(List<BillingDto> result, List<BillingPrice> billingPrices) {
        if (!CollectionUtils.isEmpty(billingPrices)) {
            for (BillingDto billingDto : result) {
                List<BillingPriceDto> priceList = billingDto.getPriceList();
                BillingPriceDto billingPriceDto = null;
                for (BillingPrice billingPrice : billingPrices) {
                    if (billingPrice.getParentUnionCode().equals(billingDto.getCode()) ) {
                        billingPriceDto = new BillingPriceDto();
                        billingPriceDto.setCode(billingPrice.getUnionCode());
                        billingPriceDto.setMax(billingPrice.getMaxPrice());
                        billingPriceDto.setMin(billingPrice.getMinPrice());
                        billingPriceDto.setShowText(billingPrice.getName());
                        priceList.add(billingPriceDto);
                    }
                }
            }


        }
    }


    private List<DictionaryDto> handlerParentChildrenResouceList(List<RobotDictionary> list) {
        List<DictionaryDto> result = Lists.newArrayList();
        List<DictionaryDto> firstLevelDtos = Lists.newArrayList();
        List<RobotDictionary> secondLevellDtos = Lists.newArrayList();
        DictionaryDto dictionaryDto = null;
        if (!CollectionUtils.isEmpty(list)) {
            for (RobotDictionary robotDictionary : list) {
                dictionaryDto = new DictionaryDto();
                dictionaryDto.setName(robotDictionary.getName());
                dictionaryDto.setCode(robotDictionary.getCode());
                if (robotDictionary.getParentCode().equals(robotDictionary.getCode())) {
                    firstLevelDtos.add(dictionaryDto);
                } else {
                    secondLevellDtos.add(robotDictionary);
                }
            }
            for (DictionaryDto dto1 : firstLevelDtos) {
                for (RobotDictionary robotDictionary : secondLevellDtos) {
                    if (robotDictionary.getParentCode().equals(dto1.getCode())) {
                        DictionaryDto child = new DictionaryDto();
                        child.setCode(robotDictionary.getCode());
                        child.setName(robotDictionary.getName());
                        dto1.getChildren().add(child);
                    }
                }
            }
        }
        result.addAll(firstLevelDtos);
        return result;

    }


}
