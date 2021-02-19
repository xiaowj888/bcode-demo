package com.wind.bcode.demo.summary.dto.req;


import com.wind.bcode.demo.summary.enums.WalletCashierTxTypeEnum;
import com.wind.bcode.demo.summary.enums.WalletChannelEnum;
import com.wind.bcode.demo.summary.enums.WalletOrderTxTypeEnum;

/**
 * @program: wallet
 * @description:钱包提交请求单
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public class WalletOrderSubmitReq {

    /**
     * 通道
     */
    private WalletChannelEnum channelEnum;

    /**
     * 订单交易类型
     */
    private WalletOrderTxTypeEnum orderTxType;


    /**
     * 现金交易类型
     */
    private WalletCashierTxTypeEnum cashierTxTypeEnum;


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


    public WalletOrderTxTypeEnum getOrderTxType() {
        return orderTxType;
    }

    public void setOrderTxType(WalletOrderTxTypeEnum orderTxType) {
        this.orderTxType = orderTxType;
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

    public WalletCashierTxTypeEnum getCashierTxTypeEnum() {
        return cashierTxTypeEnum;
    }

    public void setCashierTxTypeEnum(WalletCashierTxTypeEnum cashierTxTypeEnum) {
        this.cashierTxTypeEnum = cashierTxTypeEnum;
    }

    public WalletChannelEnum getChannelEnum() {
        return channelEnum;
    }

    public void setChannelEnum(WalletChannelEnum channelEnum) {
        this.channelEnum = channelEnum;
    }
}
