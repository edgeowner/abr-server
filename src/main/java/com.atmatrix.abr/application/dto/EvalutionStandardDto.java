package com.atmatrix.abr.application.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: EvalutionStandardDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-28 3:56 PM
 **/

@Data
public class EvalutionStandardDto {
    private String workTypeCode;
    private Integer robotAmount;
    private String maxScore;
    private String avgScore;
    private String exceScore;
    private Boolean hasExceRobot;

}
