package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ContractRentTime {
    private Integer id;

    private String rentUnionCode;

    private String rentStartTime;

    private String rentEndTime;

    private String actualEndTime;

    private String createTime;

    private String updateTime;


}