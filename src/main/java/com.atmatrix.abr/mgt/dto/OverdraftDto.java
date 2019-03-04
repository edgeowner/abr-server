package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotExceOverdraftDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-04 11:41 AM
 **/
@Data
public class OverdraftDto {
    private Integer id;
    private String deviceId; //设备ID
    private String robotUnionCode;
    private String rentUnionCode;
    private String workTypeCode; //工种编号
    private String workTypeName; //工种名称
    private String balanceLeft; // 余额可使用天数/次数
    private String workAddress; //工作地点
    private String refOverdraft; //建议透支额度
    private String refDesc; //原因
}
