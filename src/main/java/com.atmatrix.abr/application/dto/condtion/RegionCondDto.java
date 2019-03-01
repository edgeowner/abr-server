package com.atmatrix.abr.application.dto.condtion;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RegionCondDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-20 7:47 PM
 **/

@Data
public class RegionCondDto {
    private String code;
    private String name;
    private String childCode;
    private String childName;
}
