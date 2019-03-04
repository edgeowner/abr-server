package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;


@Data
public class RentAddress {

    private Integer id;

    private String rentUnionCode;

    private String robotUnionCode;

    private String regionCode;

    private String regionName;

    private String workAddress;

    private Integer delete;

    private String createTime;

    private String updateTime;


}