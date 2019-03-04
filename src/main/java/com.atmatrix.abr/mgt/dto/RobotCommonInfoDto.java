package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotCommonInfoDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 4:42 PM
 **/

@Data
public class RobotCommonInfoDto {
    private Integer id;
    private String accountAddress;
    private String deviceId;
    private String robotUnionCode;
    private String rentUnionCode;
    private String robotName;
    private String workTypeCode;
    private String workTypeName;

    private String exceTypeCode;

    private String exceTime;
    private String workAddress;
    private String analysis;
    private String reason;
    private String createTime;
    private String updateTime;



}
