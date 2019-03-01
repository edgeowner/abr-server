package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;


@Data
public class EvaluationStandard {
    private Integer id;

    private String unionCode;

    private String workTypeCode;

    private Integer robotAmount;

    private String avgScore;

    private String maxScore;

    private String exceScore;

    private Integer delete;

    private String createTime;

    private String updateTime;

}