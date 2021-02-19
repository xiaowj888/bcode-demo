package com.wind.bcode.demo.summary.handler;

import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;

/**
 * @program: wallet
 * @description: 钱包现金操作接口
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public interface IWalletCashierHandler {
    /**
     * 处理现金操作
     * @param walletCashierTxDto 现金操作参数
     */
    void handleCashier(WalletCashierTxDTO walletCashierTxDto);
}
