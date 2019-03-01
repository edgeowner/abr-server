package com.atmatrix.abr.mgt.dto;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: EvaluationStandardExtendDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 4:35 PM
 **/

@Data
public class EvaluationStandardExtendDto {
    private Integer id;
    private String unionCode;
    private String workTypeCode;
    private String workTypeName;
    private String robotAmount;
    private String avgScore;
    private String maxScore;
    private String exceScore;
    private Integer delete;
    private String createTime;
    private String updateTime;

}
