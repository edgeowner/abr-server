package com.atmatrix.abr.application.dto.condtion;

import com.atmatrix.abr.application.dto.page.PageQuery;
import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: WorkTypeCondDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-01 11:51 AM
 **/

@Data
public class WorkTypeCondDto {
    private String workTypeCode;
    private PageQuery pageQuery;
}
