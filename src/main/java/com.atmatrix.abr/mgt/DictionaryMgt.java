package com.atmatrix.abr.mgt;

import com.atmatrix.abr.application.dto.DictionaryDto;
import com.atmatrix.abr.application.dto.RegionDto;
import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DictionaryMgt {


//    PageInfo<RegionDto> getDictionaryListByType();

//    List<DictionaryDto> getListDtoByType(String type);

    List<RobotDictionary> getListDtoByTypeList();

    List<RobotDictionary> getListDtoByType(String type);
}
