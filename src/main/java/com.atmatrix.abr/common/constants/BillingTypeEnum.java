package com.atmatrix.abr.common.constants;

public enum BillingTypeEnum {
    DAY(1, "按天计费"),
    FREQUENCY(2, "按次计费");

    private Integer code;
    private String name;

    BillingTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static BillingTypeEnum getByCode(Integer code) {
        for (BillingTypeEnum item : BillingTypeEnum.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }
}
