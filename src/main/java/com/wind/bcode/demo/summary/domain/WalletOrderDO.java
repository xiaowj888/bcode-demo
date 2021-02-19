package com.wind.bcode.demo.summary.domain;


import com.wind.bcode.demo.summary.enums.WalletChannelEnum;

/**
 * @program: wallet
 * @description:钱包提交请求单
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public class WalletOrderDO {
    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单金额
     */
    private Long orderAmt;

    /**
     * 订单请求单号
     */
    private String orderReqNo;

    /**
     * 订单操作账户编号
     */
    private String accountNo;

    /**
     * 订单交易类型
     */
    private String walletOrderTxType;


    /**
     * 现金交易类型
     */
    private String cashierTxType;

    /**
     * 通道
     */
    private WalletChannelEnum channelEnum;


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

    public String getOrderReqNo() {
        return orderReqNo;
    }

    public void setOrderReqNo(String orderReqNo) {
        this.orderReqNo = orderReqNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getWalletOrderTxType() {
        return walletOrderTxType;
    }

    public void setWalletOrderTxType(String walletOrderTxType) {
        this.walletOrderTxType = walletOrderTxType;
    }

    public String getCashierTxType() {
        return cashierTxType;
    }

    public WalletChannelEnum getChannelEnum() {
        return channelEnum;
    }

    public void setChannelEnum(WalletChannelEnum channelEnum) {
        this.channelEnum = channelEnum;
    }

    public void setCashierTxType(String cashierTxType) {
        this.cashierTxType = cashierTxType;
    }
}
