package com.atmatrix.abr.application.impl;

import com.atmatrix.abr.application.EvaluationApplication;
import com.atmatrix.abr.application.dto.EvalutionStandardDto;
import com.atmatrix.abr.mgt.EvaluationMgt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: abr-server
 * @ClassName: EvaluationApplicationImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-28 3:40 PM
 **/

@Service
public class EvaluationApplicationImpl implements EvaluationApplication {


    @Autowired
    private EvaluationMgt evaluationMgt;

    EvalutionStandardDto queryStandardGroupByWorkType() {
        EvalutionStandardDto result = new EvalutionStandardDto();
        return result;
    }

}
