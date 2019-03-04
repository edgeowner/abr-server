package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotPriceExceDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-04 7:31 AM
 **/

@Data
public class RobotPriceExceDto {
    private Integer id;
    private String rentUnionCode; //异常标识
    private String robotUnionCode; //机器人唯一标识
    private String lastProceeds; //最近一次单日收入
    private String deviceId; //设备ID
    private String workAddress; //国作地址
    private String analysis; //异常原因
    private Double workHours; //平均工作时长
    private String workTimes;//工作次数
    private String workTimeTotal;//累计工作时长
    private String createTime;
    private String updateTime;
}
