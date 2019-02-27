package com.atmatrix.abr.application.dto;

import com.atmatrix.abr.mgt.dto.BillingTypeDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;
import com.atmatrix.abr.mgt.dto.RobotWorkTypeDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotExtendDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-25 5:10 PM
 **/

@Data
public class RobotInfoDto extends RobotDetailExtendDto {

    List<ParamDto> params = new ArrayList<>();

    List<BillingTypeDto> billingTypes = new ArrayList<>();
}
