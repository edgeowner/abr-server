package com.atmatrix.abr.application.dto;

import lombok.Data;

import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: ExceRobotInfoDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 4:36 PM
 **/

@Data
public class ExceRobotInfoDto {
    private String accoutAddress;
    private String deviceId;
    private String robotUnionCode;
    private String robotName;
    private String workTypeCode;
    private String workTypeName;

    private String exceTime;
    private String workAddress;


    //异常类型
    private String exceTypeCode;
    private String exceTypeName;

    Map<String, String> exceInfo;

}
