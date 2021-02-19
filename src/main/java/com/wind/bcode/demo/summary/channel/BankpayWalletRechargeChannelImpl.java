package com.wind.bcode.demo.summary.channel;

import com.wind.bcode.demo.summary.dto.WalletRechargeTxDTO;
import com.wind.bcode.demo.summary.strategy.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: wallet
 * @description: 冻结
 * @author: xiaowj
 * @created: 2021-01-31
 * {@link com.wind.bcode.demo.summary.enums.WalletChannelEnum#BANKPAY}
 **/
@Component
@Strategy(values = "BANKPAY")
public class BankpayWalletRechargeChannelImpl implements IWalletRechargeChannel {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void recharge(WalletRechargeTxDTO rechargeDto) {
        logger.info("使用银行卡充值");
    }
}
