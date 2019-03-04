package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotOverdraftDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 3:10 PM
 **/

@Data
public class RobotOverdraftDto {
    private Integer id;
    private String robotUnionCode;
    private String rentUnionCode;
    private String accountAddress;
    private String workTypeCode;
    private String workTypeName;


    private String exceTime;
    private Double overdraft;
    private String billingUnit;//计费单位
    private Double unitPrice;
    private Integer delete;
    private String createTime;
    private String updateTime;

}
