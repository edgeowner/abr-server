package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RobotProceeds {
    private Integer id;

    private String unionCode;

    private String robotUnionCode;

    private String rentUnionCode;

    private String workTypeCode;

    private Double lastProceeds;

    private String unitPrice;

    private Integer delete;

    private Integer lastFlag;

    private String createTime;

    private String updateTime;

}