package com.atmatrix.abr.application.dto.page;


/**
 * 分页查询参数
 *
 * Created by jason on 2017/2/6.
 */
public class PageQuery {
    private Integer pageSize;
    private Integer pageNo;

    public PageQuery(){

    }

    public PageQuery(int pageNo, int pageSize){
        this.pageNo=pageNo;
        this.pageSize=pageSize;

    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
}
