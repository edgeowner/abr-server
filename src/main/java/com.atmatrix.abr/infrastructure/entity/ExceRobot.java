package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;


@Data
public class ExceRobot {
    private Integer id;

    private String robotUnionCode;

    private String rentUnionCode;

    private String exceTypeCode;

    private String exceTypeName;

    private String analysis;

    private String exceTime;

    private Integer delete;

    private String createTime;

    private String updateTime;

}