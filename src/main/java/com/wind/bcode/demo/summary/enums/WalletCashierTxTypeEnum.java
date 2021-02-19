package com.wind.bcode.demo.summary.enums;
/**
 * @program: wallet
 * @description:钱包现金交易类型
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public enum WalletCashierTxTypeEnum {
    //充值
    RECHARGE,
    //提现
    WITHDRAW,
    //转账
    TRANSFER,
    //冻结
    FROZEN,
    //解冻
    UNFROZEN,
    //申购
    PURCHASE,
    //赎回
    REDEEM;
}
