package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ContractRent {
    
    private Integer id;

    private String unionCode;

    private String robotUnionCode;

    private String rentAddress;

    private String robotAddress;

    private BigDecimal billingPrice;

    private String billingPriceUnit;

    private String billingType;

    private Integer billingOverdraft;

    private Integer totalPrice;

    private Integer contractStatus;

    private String createTime;

    private String updateTime;

}