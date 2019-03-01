package com.atmatrix.abr.mgt.dto;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotDetailExtendDto
 * @Description:
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
    private String rentStatusCode;
    private String rentStatusName;
    private String workTypeName;
    private String workTypeCode;
    private String workTypeDesc;
    private Integer leftDayOrTimes;
    private String billingTypeCode;
    private Integer billingPrice;
    private String billingTypeName;
    private String picUrl;
    private String unit;//单位
    private Integer overdraft;//透支额度


    //按钮是否可点控制
    private Boolean canRent = false;
    private Boolean canRecharge = false;
    private Boolean canAdjustPrice = false;
    private Boolean startOrStop = false;  //true ->开启状态 //false ->停止状态
}
