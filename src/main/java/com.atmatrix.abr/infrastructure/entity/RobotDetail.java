package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.util.Date;


@Data
public class RobotDetail {
    private Integer id;

    private String robotName;

    private String robotUnionCode;

    private String regionCode;

    private String regionName;

    private String billingType;

    private Integer billingPrice;

    private String rentStatus;

    private String workType;

    private Integer delete;

    private Date createTime;

    private Date updateTime;


}