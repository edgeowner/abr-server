package com.atmatrix.abr.infrastructure.dao;


import com.atmatrix.abr.mgt.dto.EvaluationStandardExtendDto;

import java.util.List;

public interface EvaluationExtendDao {

    List<EvaluationStandardExtendDto> queryStandardByWorkType();
}