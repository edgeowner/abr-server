package com.atmatrix.abr.application.dto;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 8:06 PM
 **/
@Data
public class BillingDto {
    private String code;
    private String name;
    private String type;
    private List<BillingPriceDto> priceList = Lists.newArrayList();

}
