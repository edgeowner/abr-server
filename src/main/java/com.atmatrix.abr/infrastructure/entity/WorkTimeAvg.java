package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;


@Data
public class WorkTimeAvg {
    private Integer id;
    private String robotUnionCode;
    private String rentUnionCode;
    private Double avgWorkHour;
    private Double avgWorkCount;
    private Double totalWorkHour;
    private Integer delete;
    private String createTime;
    private String updateTime;

}