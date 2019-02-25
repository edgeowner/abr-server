package com.atmatrix.abr.common.web;

import com.github.pagehelper.Page;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: PageReuslt
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 10:09 AM
 **/

@ApiModel(description = "分页结果")
@Data
public class PageResult<T>implements Serializable {


    private static final long serialVersionUID = 7480857150915898193L;

    private Page page;
    private List<T> list;



}

