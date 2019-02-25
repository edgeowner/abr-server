package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RobotParam  {

    private Integer id;

    private String robotUnionCode;

    private String key;

    private String value;

    private Integer delete;

    private String createTime;

    private String updateTime;

}