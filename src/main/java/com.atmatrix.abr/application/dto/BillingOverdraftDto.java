package com.atmatrix.abr.application.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: BillingOverdraftDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 3:04 PM
 **/

@Data
public class BillingOverdraftDto {
    private String robotUnionCode;
    private String rentUnionCode;
    private String billingTypeCode;
    private String billingTypeName;
    private String unitPrice;
    private String robotAccountAddress;
    private Double overdraft;
    private String unit;
}
