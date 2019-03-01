package com.atmatrix.abr.application.dto.condtion;

import com.atmatrix.abr.application.dto.page.PageQuery;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: QueryPageDicConditionDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 11:40 AM
 **/

@Data
public class QueryCondDicDto {
    private RegionCondDto regionCondDto;
    private List<String> workTypeCodes;
    private String billingTypeCode;
    private String billingPriceCode;
    private String rentStatus;
    private PageQuery page;
    private Integer min;
    private Integer max;

}
