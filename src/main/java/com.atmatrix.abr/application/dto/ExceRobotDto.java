package com.atmatrix.abr.application.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: ExceRobotDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 4:06 PM
 **/

@Data
public class ExceRobotDto {
    private Integer id;
    private String robotUnionCode;
    private String robotName;
    private String reason;
    private String exceTime;


    private String deviceId;
    private String exceTypeCode;
    private String exceTypeName;
    private String rentUnionCode; //
}
