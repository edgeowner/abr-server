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
public class RobotExceptionDto {
    private Integer id;
    private String robotUnionCode;
    private String deviceId;
    private String workAddress;  //机器人工作
    private String lastScore;//最近一次绩效
}
