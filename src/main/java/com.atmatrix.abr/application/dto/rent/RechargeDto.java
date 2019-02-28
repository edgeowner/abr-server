package com.atmatrix.abr.application.dto.rent;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RechargeDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-27 4:12 PM
 **/

@Data
public class RechargeDto {
    private String robotUnionCode;
    private Integer amount;//充值数
    private String robotAccountAddress;
}
