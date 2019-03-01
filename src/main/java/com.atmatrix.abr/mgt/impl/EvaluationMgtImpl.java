package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.infrastructure.dao.EvaluationExtendDao;
import com.atmatrix.abr.mgt.EvaluationMgt;
import com.atmatrix.abr.mgt.dto.EvaluationStandardExtendDto;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: EvaluationMgtImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 4:00 PM
 **/

@Component
public class EvaluationMgtImpl implements EvaluationMgt {

    @Autowired
    private EvaluationExtendDao evaluationExtendDao;

    @Override
    public List<EvaluationStandardExtendDto> queryStandardExtendGroupByWorkType(PageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());
        List<EvaluationStandardExtendDto> result = evaluationExtendDao.queryStandardByWorkType();
        return result;
    }

}
