package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;


@Data
public class UserAccount {
    private Integer id;

    private String userUnionId;

    private String accountAddress;

    private String name;

    private String phone;

    private String address;

    private String createTime;

    private String updateTime;

}