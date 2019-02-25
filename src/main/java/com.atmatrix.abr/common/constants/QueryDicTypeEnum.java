package com.atmatrix.abr.common.constants;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: QueryTypeConstants
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-21 2:04 PM
 **/

public enum QueryDicTypeEnum {
    REGION(1, "region"),
    WORK_TYPE(2, "workType"),
    BILLING(3, "billing"),
    RENT_STATUS(4, "rentStatus");
    private Integer code;
    private String name;

    QueryDicTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static QueryDicTypeEnum getByCode(Integer code) {
        for (QueryDicTypeEnum item : QueryDicTypeEnum.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }

    public static List<String> getAllValues(){
        List<String> result = Lists.newArrayList();
        for (QueryDicTypeEnum item : QueryDicTypeEnum.values()) {
            result.add(item.getName());
        }
        return result;

    }
}
