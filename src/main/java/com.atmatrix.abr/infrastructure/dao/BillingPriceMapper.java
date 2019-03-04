package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.BillingPriceScope;
import com.atmatrix.abr.infrastructure.entity.BillingPriceScopeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingPriceMapper
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 8:39 PM
 **/

public interface BillingPriceMapper {
    long countByExample(BillingPriceScopeExample example);

    int deleteByExample(BillingPriceScopeExample example);

    int insert(BillingPriceScope record);

    int insertSelective(BillingPriceScope record);

    List<BillingPriceScope> selectByExample(BillingPriceScopeExample example);

    int updateByExampleSelective(@Param("record") BillingPriceScope record, @Param("example") BillingPriceScopeExample example);

    int updateByExample(@Param("record") BillingPriceScope record, @Param("example") BillingPriceScopeExample example);


    List<BillingPriceScope> getBillingPriceByParentCode(@Param("list") List<String> parentCode);

    BillingPriceScope getBillingPriceByCode(@Param("code") String code);
}
