package com.atmatrix.abr.mgt;


import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.page.PageQuery;
import com.atmatrix.abr.mgt.dto.RobotConditionDto;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;

public interface RobotDetailMgt {

    PageInfoResult<RobotDetailDto> getDictionaryListByPageDto(RobotConditionDto dicCondDto, PageQuery pageQuery);


    RobotDetailExtendDto getRobotDetailInfo(String unionCode);
}
