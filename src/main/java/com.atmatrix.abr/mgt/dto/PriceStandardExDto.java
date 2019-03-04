package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: PriceStandardExDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-04 7:16 AM
 **/

@Data
public class PriceStandardExDto  {

    private Integer id;
    private String unionCode;
    private String workTypeCode;
    private String workTypeName;

    private Double maxDayProceeds;
    private Double avgDayProceeds;
    private Double excDayProceeds;
    private String createTime;
    private String updateTime;
}
