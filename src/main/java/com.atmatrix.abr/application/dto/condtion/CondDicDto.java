package com.atmatrix.abr.application.dto.condtion;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: CondDicDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 1:53 PM
 **/

@Data
public class CondDicDto {
    private RegionConditionDto regionConditionDto;
    private List<Integer> workTypeKeys;
    private Integer billingType;
    private List<Integer> price;
    private Integer rentStatus;
}
