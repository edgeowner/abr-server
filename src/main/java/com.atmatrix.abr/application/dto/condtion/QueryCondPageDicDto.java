package com.atmatrix.abr.application.dto.condtion;

import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.common.web.PageDto;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: QueryPageDicConditionDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 11:40 AM
 **/

@Data
public class QueryCondPageDicDto {
    private RegionConditionDto regionConditionDto;
    private List<String> workTypeCodes;
    private String billingTypeCode;
    private String billingPriceCode;
    private String rentStatus;
    private PageQuery page;


}
