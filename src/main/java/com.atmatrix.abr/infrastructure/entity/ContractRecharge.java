package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

@Data
public class ContractRecharge {
    private Integer id;

    private String unionCode;

    private String accountAddress;

    private String fromAddress;

    private String billingType;

    private Integer amount;

    private String unitCode;

    private Integer totalPrice;

    private Integer delete;

    private String createTime;

    private String updateTime;
}