package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.common.constants.QueryDicTypeEnum;
import com.atmatrix.abr.infrastructure.dao.RobotDictionaryMapper;
import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.atmatrix.abr.mgt.DictionaryMgt;
import com.atmatrix.abr.mgt.dto.BillingTypeDto;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: DictionaryMgtImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-20 7:51 PM
 **/


@Component
public class DictionaryMgtImpl implements DictionaryMgt {

    @Autowired
    private RobotDictionaryMapper robotDictionaryMapper;

    @Override
    public List<RobotDictionary> getListDtoByTypeList() {
        List<String> types = QueryDicTypeEnum.getAllValues();
        List<RobotDictionary> resource = robotDictionaryMapper.getListByTypes(types);
        return resource;
    }

    @Override
    public List<RobotDictionary> getListDtoByType(String type) {
        List<RobotDictionary> result = robotDictionaryMapper.getListByType(type);
        return result;
    }

    @Override
    public List<BillingTypeDto> getBillingTypes() {
        return robotDictionaryMapper.getBillingTypeList();
    }
}
