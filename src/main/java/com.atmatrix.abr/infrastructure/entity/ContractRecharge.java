package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;

@Data
public class ContractRecharge {
    private Integer id;

    private String accountAddress;

    private String billingType;

    private Integer amount;

    private String unit;

    private Integer delete;

    private String createTime;

    private String updateTime;
}