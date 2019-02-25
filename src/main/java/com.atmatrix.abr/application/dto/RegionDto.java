package com.atmatrix.abr.application.dto;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RegionConditionDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-20 7:47 PM
 **/

@Data
public class RegionDto {
    private String name;
    private String code;
    private String parentCode;
    private String parentName;
    private List<RegionDto> regionList;
}
