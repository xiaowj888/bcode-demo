package com.wind.bcode.demo.summary.dto;

import com.wind.bcode.demo.summary.enums.WalletCashierTxTypeEnum;
import com.wind.bcode.demo.summary.enums.WalletChannelEnum;

/**
 * @program: wallet
 * @description:钱包现金交易DTO
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public class WalletCashierTxDTO {

    /**
     * 通道
     */
    private WalletChannelEnum channelEnum;

    /**
     * 现金交易类型
     */
    private WalletCashierTxTypeEnum cashierTxTypeEnum;

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

   public boolean isTypeNotNull(){
       return null != getCashierTxTypeEnum();
   }

    /**
     * 是否充值
     * @return
     */
    public boolean isRecharge(){
        return isTypeNotNull() && WalletCashierTxTypeEnum.RECHARGE == getCashierTxTypeEnum();
    }

    /**
     * 是否提现
     * @return
     */
    public boolean isWithDraw(){
        return isTypeNotNull() && WalletCashierTxTypeEnum.WITHDRAW == getCashierTxTypeEnum();
    }

    /**
     * 是否转换
     * @return
     */
    public boolean isTransfer(){
        return isTypeNotNull() && WalletCashierTxTypeEnum.TRANSFER == getCashierTxTypeEnum();
    }

    /**
     * 是否冻结
     * @return
     */
    public boolean isFrozen(){
        return isTypeNotNull() && WalletCashierTxTypeEnum.FROZEN == getCashierTxTypeEnum();
    }

    /**
     * 是否解冻
     * @return
     */
    public boolean isUnFrozen(){
        return isTypeNotNull() && WalletCashierTxTypeEnum.UNFROZEN == getCashierTxTypeEnum();
    }

    /**
     * 是否申购
     * @return
     */
    public boolean isPurchase(){
        return isTypeNotNull() && WalletCashierTxTypeEnum.PURCHASE == getCashierTxTypeEnum();
    }

    /**
     * 是否赎回
     * @return
     */
    public boolean isRedeem(){
        return isTypeNotNull() && WalletCashierTxTypeEnum.REDEEM == getCashierTxTypeEnum();
    }





    public WalletCashierTxTypeEnum getCashierTxTypeEnum() {
        return cashierTxTypeEnum;
    }

    public void setCashierTxTypeEnum(WalletCashierTxTypeEnum cashierTxTypeEnum) {
        this.cashierTxTypeEnum = cashierTxTypeEnum;
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

    public WalletChannelEnum getChannelEnum() {
        return channelEnum;
    }

    public void setChannelEnum(WalletChannelEnum channelEnum) {
        this.channelEnum = channelEnum;
    }
}
