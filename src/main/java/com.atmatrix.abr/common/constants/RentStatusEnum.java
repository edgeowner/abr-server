package com.atmatrix.abr.common.constants;

/**
 * @ProjectName: abr-server
 * @ClassName: RentStatusEnum
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 5:34 PM
 **/

public enum RentStatusEnum {
    RENT("1", "已出租"),
    NOT_RENT("2", "未出租");


    private String code;
    private String name;

    RentStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static DeleteEnum getByCode(String code) {
        for (DeleteEnum item : DeleteEnum.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }

}
