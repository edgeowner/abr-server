package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RobotBasic {
    private Integer id;

    private String deviceId;

    private String unionCode;

    private String accountAddress;

    private String robotName;

    private String robotPicUrl;

    private String createTime;

    private String updateTime;


}