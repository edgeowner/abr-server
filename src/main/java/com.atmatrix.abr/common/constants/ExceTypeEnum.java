package com.atmatrix.abr.common.constants;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: ExceTypeEnum
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-03-01 5:30 PM
 **/

public enum ExceTypeEnum {
    EVALUATION("100", "evaluation"),
    PRICE("200", "price"),
    BILLING("300", "billing"),
    OVERDRAFT("400", "overdraft");
    private String code;
    private String name;

    ExceTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static QueryDicTypeEnum getByCode(String code) {
        for (QueryDicTypeEnum item : QueryDicTypeEnum.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }

    public static List<String> getAllValues() {
        List<String> result = Lists.newArrayList();
        for (QueryDicTypeEnum item : QueryDicTypeEnum.values()) {
            result.add(item.getName());
        }
        return result;
    }
}
