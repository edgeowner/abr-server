package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RobotWorktype {
    private Integer id;

    private String worktypeName;

    private String unionCode;

    private Integer delete;

    private String createTime;

    private String updateTime;


}