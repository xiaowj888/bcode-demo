package com.wind.bcode.demo.summary.channel;

import com.wind.bcode.demo.summary.dto.WalletRechargeTxDTO;

/**
 * @program: wallet
 * @description: 钱包充值通道接口
 * @author: xiaowj
 * @created: 2021-02-03
 **/
public interface IWalletRechargeChannel {
    void recharge(WalletRechargeTxDTO rechargeDto);
}
