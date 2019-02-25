package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.BillingPrice;
import com.atmatrix.abr.infrastructure.entity.BillingPriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingPriceMapper
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 8:39 PM
 **/

public interface BillingPriceMapper {
    long countByExample(BillingPriceExample example);

    int deleteByExample(BillingPriceExample example);

    int insert(BillingPrice record);

    int insertSelective(BillingPrice record);

    List<BillingPrice> selectByExample(BillingPriceExample example);

    int updateByExampleSelective(@Param("record") BillingPrice record, @Param("example") BillingPriceExample example);

    int updateByExample(@Param("record") BillingPrice record, @Param("example") BillingPriceExample example);


    List<BillingPrice> getBillingPriceByParentCode(@Param("list")List<String> parentCode);

    BillingPrice getBillingPriceByCode(@Param("code") String code);
}
