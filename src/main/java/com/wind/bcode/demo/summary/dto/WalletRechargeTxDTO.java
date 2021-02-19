package com.wind.bcode.demo.summary.dto;

import com.wind.bcode.demo.summary.enums.WalletChannelEnum;

/**
 * @program: wallet
 * @description:钱包充值DTO
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public class WalletRechargeTxDTO {

    /**
     * 充值通道
     */
    private WalletChannelEnum channelEnum;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单金额
     */
    private Long orderAmt;

    /**
     * 订单操作账户编号
     */
    private String accountNo;


    public WalletChannelEnum getChannelEnum() {
        return channelEnum;
    }

    public void setChannelEnum(WalletChannelEnum channelEnum) {
        this.channelEnum = channelEnum;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(Long orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
