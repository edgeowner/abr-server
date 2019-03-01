package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;


@Data
public class WorkType {
    private Integer id;

    private String worktypeName;

    private String unionCode;

    private String picUrl;

    private Integer delete;

    private String createTime;

    private String updateTime;

}