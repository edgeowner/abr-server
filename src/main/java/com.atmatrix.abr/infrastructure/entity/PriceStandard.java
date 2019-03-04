package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PriceStandard {
    private Integer id;

    private String unionCode;

    private String workTypeCode;

    private Integer robotAmount;

    private Double maxDayProceeds;

    private Double avgDayProceeds;

    private Double excDayProceeds;

    private Integer delete;

    private String createTime;

    private String updateTime;

}