package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotDetailExtendDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-22 5:30 PM
 **/

@Data
public class RobotDetailExtendDto {
    private Integer id;
    private String robotUnionCode;
    private String deviceId;
    private String accountAddress;
    private String name;
    private String rentStatus;
    private String rentName;
    private String workTypeName;
    private String workTypeCode;
    private String workTypeDesc;
    private Integer leftDayOrTimes;
    private String billingTypeCode;
    private String billingPrice;
    private String billingTypeName;
    private String picUrl;
}
