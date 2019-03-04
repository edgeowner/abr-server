package com.atmatrix.abr.mgt;

import com.atmatrix.abr.application.dto.PriceStandardDto;
import com.atmatrix.abr.application.dto.page.PageQuery;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: PriceMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-04 6:55 AM
 **/

@Component
public interface PriceMgt {
    List<PriceStandardDto> queryStandardGroupByWorkType(PageQuery pageQuery);
}
