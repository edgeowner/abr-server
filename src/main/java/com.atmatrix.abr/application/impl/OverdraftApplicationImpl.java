package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.OverdraftApplication;
import com.atmatrix.abr.application.dto.BillingOverdraftDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.mgt.RobotOverdraftMgt;
import com.atmatrix.abr.mgt.dto.OverdraftDto;
import com.atmatrix.abr.mgt.dto.RobotExceOverdraftDto;
import com.atmatrix.abr.mgt.dto.RobotOverdraftDto;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: OverdraftApplicationImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 2:07 PM
 **/

@Service
public class OverdraftApplicationImpl implements OverdraftApplication {

    @Autowired
    private RobotOverdraftMgt overdraftMgt;


    @Override
    public PageInfoResult<OverdraftDto> getRobotBalanceInfo(QueryCondPageDto cond) {
        if (cond == null) {
            return PageInfoResult.buildPage();
        }
        PageQuery page = cond.getPageQuery();
        List<RobotExceOverdraftDto> resource = overdraftMgt.queryRobotOverdraftInfo(page);
        List<OverdraftDto> result = Lists.newArrayList();
        resource.stream().forEach(e->{
            OverdraftDto toAdd = new OverdraftDto();
            BeanUtils.copyProperties(e,toAdd);
            result.add(toAdd);
        });
        return PageInfoResult.buildPageFromList(result);
    }

    // TODO: 2019/3/4
    @Override
    public BillingOverdraftDto getOverdraftInfo(String rentUnionCode) {
        BillingOverdraftDto result = new BillingOverdraftDto();
        RobotOverdraftDto robotOverdraftDto = overdraftMgt.queryByRentUnionCode(rentUnionCode);
        return result;
    }

    // TODO: 2019/3/4
    @Override
    public void adjustBillingPrice(WorkTypeCondDto cond) {

    }
}
