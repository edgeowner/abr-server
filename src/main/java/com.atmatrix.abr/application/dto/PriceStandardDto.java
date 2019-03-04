package com.atmatrix.abr.application.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: PriceStandardDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-01 5:12 PM
 **/

@Data
public class PriceStandardDto {
    private Integer id;
    private String unionCode;
    private String workTypeCode;
    private String workTypeName;

    private Integer robotAmount;
    private Double maxDayProceeds;
    private Double avgDayProceeds;
    private Double excDayProceeds;

    private Boolean hasExceRobot;

}
