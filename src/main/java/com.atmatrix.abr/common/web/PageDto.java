package com.atmatrix.abr.common.web;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: abr-server
 * @ClassName: Page
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 10:57 AM
 **/

@Data
public class PageDto implements Serializable {


    private static final long serialVersionUID = 3666424219041235275L;

    private int pageNo;

    private int pageSize;

    private int totalCount;

}
