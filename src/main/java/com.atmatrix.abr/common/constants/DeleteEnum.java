package com.atmatrix.abr.common.constants;

public enum DeleteEnum {
    TRUE(1,"未删除"),
    FALSE(0,"删除");

    private Integer code;
    private String name;

    DeleteEnum(Integer code,String name){
        this.code = code;
        this.name = name;
    }

    public Integer getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public static DeleteEnum getByCode(Integer code){
        for (DeleteEnum item: DeleteEnum.values()) {
            if (item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }

}
