package com.atmatrix.abr.application.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingPriceDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 8:07 PM
 **/

@Data
public class BillingPriceDto {
    private String code;
    private Integer min;
    private Integer max;
    private String showText;
}
