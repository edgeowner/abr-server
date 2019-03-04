package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RobotOverdraft {
    private Integer id;

    private String unionCode;

    private String robotUnionCode;

    private String rentUnionCode;

    private String billingTypeCode;

    private Integer billingLeft;

    private String unit;

    private Integer referenceOverdraft;

    private Integer delete;

    private String createTime;

    private String updateTime;
}