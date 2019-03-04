package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.util.Date;

@Data
public class WorkTimeRecord {
    private Integer id;

    private String unionCode;

    private String rentUnionCode;

    private String robotUnionCode;

    private Date workTimeDay;

    private Double workTimeHours;

    private Double workTimeTotal;

    private Integer workTimeCount;

    private String workAddress;

    private Integer delete;

    private String createTime;

    private String updateTime;

}