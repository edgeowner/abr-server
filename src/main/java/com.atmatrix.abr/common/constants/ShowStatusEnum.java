package com.atmatrix.abr.common.constants;

/**
 * @ProjectName: abr-server
 * @ClassName: ShowStatusEnum
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-21 3:29 PM
 **/

public enum  ShowStatusEnum {
    TRUE(1,"展示"),
    FALSE(0,"不展示");

    private Integer code;
    private String name;

    ShowStatusEnum(Integer code,String name){
        this.code = code;
        this.name = name;
    }

    public Integer getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public static ShowStatusEnum getByCode(Integer code){
        for (ShowStatusEnum item: ShowStatusEnum.values()) {
            if (item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }
}
