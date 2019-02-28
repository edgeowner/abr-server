package com.atmatrix.abr.mgt.dto;

import com.atmatrix.abr.infrastructure.entity.RobotDetail;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotDetailDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-22 11:59 AM
 **/

@Data
@EqualsAndHashCode(callSuper=false)
public class RobotDetailDto extends RobotDetail {
    private String rentStatusName;
    private String workTypeName;
    private String workTypeDesc;
    private String billingTypeName;
    private String picUrl;
    private String unit;
    private String unitCode;


}
