package com.atmatrix.abr.application.dto.evaluation;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: EvalutionStandardDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 3:56 PM
 **/

@Data
public class EvaluationStandardDto {
    private Integer id;
    private String unionCode;
    private String workTypeCode;
    private String workTypeName;
    private Integer robotAmount;
    private String maxScore;
    private String avgScore;
    private String exceScore;
    private Boolean hasExceRobot;

}
