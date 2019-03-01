package com.atmatrix.abr.application;

import com.atmatrix.abr.application.dto.BillingDto;
import com.atmatrix.abr.application.dto.DictionaryDto;
import com.atmatrix.abr.mgt.dto.RobotWorkTypeDto;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: DictionaryAppliction
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-20 7:45 PM
 **/

public interface DictionaryAppliction {

    Map<String,List<DictionaryDto>> queryDicList();

    List<DictionaryDto> queryRegionList();

    List<BillingDto> queryBillingList();

    List<DictionaryDto> queryRentStatusList();

    List<RobotWorkTypeDto> queryWorkTypeList();



}
