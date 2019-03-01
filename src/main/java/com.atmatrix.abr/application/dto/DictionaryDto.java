package com.atmatrix.abr.application.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: DictionaryDto
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 2:17 PM
 **/

@Data
public class DictionaryDto {
    private String name;
    private String code;
    private List<DictionaryDto> children=new ArrayList<>();
}
