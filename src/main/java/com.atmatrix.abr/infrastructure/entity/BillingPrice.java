package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;


import java.util.Date;

@Data
public class BillingPrice {
    private Integer id;

    private String parentUnionCode;

    private String unionCode;

    private String name;

    private Integer minPrice;

    private Integer maxPrice;

    private Integer type;

    private String unit;

    private Integer delete;

    private String createTime;

    private String updateTime;


}