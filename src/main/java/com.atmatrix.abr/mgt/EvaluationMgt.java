package com.atmatrix.abr.mgt;

import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.mgt.dto.EvaluationStandardExtendDto;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: EvaluationMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 4:00 PM
 **/

public interface EvaluationMgt {

    List<EvaluationStandardExtendDto> queryStandardExtendGroupByWorkType(PageQuery pageQuery);

}
