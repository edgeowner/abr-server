package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: ExceRobotExtend
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 4:18 PM
 **/

@Data
public class ExceRobotExtend {
    private Integer id;
    private String deviceId;
    private String robotName;
    private String exceTypeCode;
    private String exceTypeName;
    private String robotUnionCode;
    private String rentUnionCode; //
    private String reason; //报警原因
    private String exceTime; //报警原因

}
