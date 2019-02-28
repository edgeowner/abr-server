package com.atmatrix.abr.common.constants;

public enum BillingTypeEnum {
    DAY("100", "天"),
    FREQUENCY("200", "次");

    private String code;
    private String name;

    BillingTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static BillingTypeEnum getByCode(String code) {
        for (BillingTypeEnum item : BillingTypeEnum.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }
}
