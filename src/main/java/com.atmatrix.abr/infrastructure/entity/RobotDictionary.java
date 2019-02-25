package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RobotDictionary  {
    private Integer id;

    private String type;

    private String code;

    private String name;

    private String parentCode;

    private String parentName;

    private Integer level;

    private Integer showStatus;

    private Integer sort;

    private Integer delete;

    private String createTime;

    private String updateTime;


}