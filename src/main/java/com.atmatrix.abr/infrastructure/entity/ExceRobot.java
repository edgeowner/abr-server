package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExceRobot {
    private Integer id;

    private String robotUnionCode;

    private String exceptionUnionCode;

    private String exceptionTypeName;

    private String analysis; //分析结果

    private String exceptionTime;

    private String createTime;

    private String updateTime;


}