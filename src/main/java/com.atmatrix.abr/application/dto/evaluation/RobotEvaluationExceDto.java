package com.atmatrix.abr.application.dto.evaluation;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotEvaluationDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 5:39 PM
 **/

@Data
public class RobotEvaluationExceDto {

    private Integer id;
    private String rentUnionCode; //异常标识
    private String robotUnionCode; //机器人唯一标识
    private String deviceId; //设备ID
    private String workAddress; //国作地址
    private String lastScore; //最近绩效
    private String analysis; //异常原因
    private Double workHours; //平均工作时长
    private String workTimes;//工作
}
