package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

@Data
public class ContractRentTime {
    private Integer id;

    private String rentUnionCode;

    private String rentStartTime;

    private String rentEndTime;

    private String actualEndTime;

    private Integer delete;

    private String createTime;

    private String updateTime;


}