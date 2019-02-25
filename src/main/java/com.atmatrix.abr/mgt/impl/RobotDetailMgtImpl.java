package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.infrastructure.dao.RobotExtendDao;
import com.atmatrix.abr.mgt.RobotDetailMgt;
import com.atmatrix.abr.mgt.dto.RobotConditionDto;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: RobotDetailMgtImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 1:55 PM
 **/

@Slf4j
@Component
public class RobotDetailMgtImpl implements RobotDetailMgt {

    @Autowired
    private RobotExtendDao robotExtendDao;

    @Override
    public PageInfoResult<RobotDetailDto> getDictionaryListByPageDto(RobotConditionDto dicCondDto, PageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());
        log.info(MessageFormat.format("SQL Conditions:{0}, Page:{1}", dicCondDto, pageQuery));
        List<RobotDetailDto> robotDetails = robotExtendDao.queryListByPageCondition(dicCondDto);
        return PageInfoResult.buildPageFromList(robotDetails);
    }


    @Override
    public RobotDetailExtendDto getRobotDetailInfo(String unionCode) {
        RobotDetailExtendDto robotDetailExtendDto = robotExtendDao.queryDetailInfoByUnionCode(unionCode);
        return robotDetailExtendDto;
    }

}
