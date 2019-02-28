package com.atmatrix.abr.application.dto.rent;

import lombok.Data;

/**
 * @ProjectName: abr-server
 * @ClassName: RentContractDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-27 6:04 PM
 **/

@Data
public class RentContractDto {
    private Integer id; //主键ID
    private String unionCode; //该合约唯一ID
    private String robotUnionCode; //机器人唯一ID
    private String deviceId; //设备ID
    private String robotAddress;//机器人帐户地址
    private String rentAddress;//出租方帐户地址
    private String billingType;//计费方式
    private String billingTypeName;//计费方式
    private Integer billingPrice;//租赁价格
    private String billingPriceUnit;//租赁单位
    private Integer overdraft;//透支额度


    private String startTime; //出租开始时间
    private String endTime;//出租结束时间
    private String userUnionCode;//承租方唯一标识
    private String userContact;//承租方联系方式
    private String userName;//承租方姓名
    private String userAddress;//承租方帐户地址
    private Integer totalPrice;//总价
    private Integer contractStatus;//合约状态
}
