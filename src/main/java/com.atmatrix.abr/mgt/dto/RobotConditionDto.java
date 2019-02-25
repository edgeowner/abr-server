package com.atmatrix.abr.mgt.dto;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotConditionDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-22 8:47 AM
 **/

@Data
public class RobotConditionDto {
    private String regionCode;
    private Integer min;
    private Integer max;
    private String rentStatus;
    private List<String> workTypes;
    private String billingTypeCode;
    private boolean like=false;//是否模糊查询
}
