package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RegionMap {
    private Integer id;

    private String regionCode;

    private String regionName;

    private Integer parentId;

    private String regionLevel;

    private String regionNameEn;

    private String createTime;

    private String updateTime;


}