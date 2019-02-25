package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.common.constants.DeleteEnum;
import com.atmatrix.abr.common.constants.QueryDicTypeEnum;
import com.atmatrix.abr.common.constants.ShowStatusEnum;
import com.atmatrix.abr.infrastructure.entity.BillingPrice;
import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class RobotDictionaryMapperTest extends BaseTest{


    @Autowired
    private RobotDictionaryMapper robotDictionaryMapper;

    @Test
    public void getListByTypes() {
        List<String> typeList = Lists.newArrayList();
        List<String> allValues = QueryDicTypeEnum.getAllValues();
        List<RobotDictionary> listByTypes = robotDictionaryMapper.getListByTypes(allValues);
        System.out.println(listByTypes);
    }

    /**
     * 初始化BillingType
     *
     */
    @Test
    public void insertBillingRentStatusTypeDicTest(){
        List<RobotDictionary> billingPriceList = Lists.newArrayList();
        RobotDictionary b1 = new RobotDictionary();
        RobotDictionary b2 = new RobotDictionary();
        RobotDictionary b3 = new RobotDictionary();

        b1.setType("billing");
        b1.setCode("000");
        b1.setName("不限");
        b1.setParentCode("000");
        b1.setParentName("不限");
        b1.setLevel(1);
        b1.setShowStatus(1);
        b1.setSort(0);
        b1.setDelete(1);



        //b2
        b2.setType("billing");
        b2.setCode("100");
        b2.setName("按天计费");
        b2.setParentCode("100");
        b2.setParentName("按天计费");
        b2.setLevel(1);
        b2.setShowStatus(1);
        b2.setSort(1);
        b2.setDelete(1);


        b3.setType("billing");
        b3.setCode("200");
        b3.setName("按次计费");
        b3.setParentCode("200");
        b3.setParentName("按次计费");
        b3.setLevel(1);
        b3.setShowStatus(1);
        b3.setSort(2);
        b3.setDelete(1);


        billingPriceList.add(b1);
        billingPriceList.add(b2);
        billingPriceList.add(b3);

        RobotDictionary rent1 = new RobotDictionary();
        RobotDictionary rent2 = new RobotDictionary();
        RobotDictionary rent3 = new RobotDictionary();

        rent1.setType("rentStatus");
        rent1.setCode("0");
        rent1.setName("不限");
        rent1.setParentCode("0");
        rent1.setParentName("不限");
        rent1.setLevel(1);
        rent1.setShowStatus(1);
        rent1.setSort(0);
        rent1.setDelete(1);


        rent2.setType("rentStatus");
        rent2.setCode("1");
        rent2.setName("已出租");
        rent2.setParentCode("1");
        rent2.setParentName("已出租");
        rent2.setLevel(1);
        rent2.setShowStatus(1);
        rent2.setSort(1);
        rent2.setDelete(1);

        rent3.setType("rentStatus");
        rent3.setCode("2");
        rent3.setName("未出租");
        rent3.setParentCode("2");
        rent3.setParentName("未出租");
        rent3.setLevel(1);
        rent3.setShowStatus(1);
        rent3.setSort(2);
        rent3.setDelete(1);





        billingPriceList.add(rent1);
        billingPriceList.add(rent2);
        billingPriceList.add(rent3);
        robotDictionaryMapper.batchInsert(billingPriceList);

    }


    @Test
    public void insertBillingType(){
//        List<RobotDictionary> typeList = Lists.newArrayList();
//        RobotDictionary ro1= new RobotDictionary();
//        ro1.setCode("100");
//        ro1.setName("按天计费");
//        ro1.setType(QueryDicTypeEnum.BILLING.getName());
//        ro1.setLevel(1);
//        ro1.setParentCode("100");
//        ro1.setParentName("按天计费");
//        ro1.setShowStatus(ShowStatusEnum.TRUE.getCode());
//        ro1.setSort(1);
//        ro1.setDelete(DeleteEnum.TRUE.getCode());
//
//        RobotDictionary ro2= new RobotDictionary();
//        ro2.setCode("200");
//        ro2.setType(QueryDicTypeEnum.BILLING.getName());
//        ro2.setName("按次计费");
//        ro2.setLevel(1);
//        ro2.setParentCode("200");
//        ro2.setParentName("按次计费");
//        ro2.setSort(2);
//        ro2.setShowStatus(ShowStatusEnum.TRUE.getCode());
//        ro2.setDelete(DeleteEnum.TRUE.getCode());
//
//        typeList.add(ro1);
//        typeList.add(ro2);
//        robotDictionaryMapper.batchInsert(typeList);
    }
}