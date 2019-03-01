package com.atmatrix.abr.infrastructure.entity;


import lombok.Data;

@Data
public class RobotEvaluation {
    private Integer id;

    private String unionCode;

    private String robotUnionCode;

    private String workTypeCode;

    private String efficiency;

    private String score;

    private String createTime;

    private String updateTime;


}