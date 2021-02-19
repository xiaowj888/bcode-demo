package com.wind.bcode.demo.summary.handler;

import com.wind.bcode.demo.summary.channel.IWalletRechargeChannel;
import com.wind.bcode.demo.summary.convert.WalletRechargeConverter;
import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.dto.WalletRechargeTxDTO;
import com.wind.bcode.demo.summary.event.publisher.ReChargeSuccEventPublisher;
import com.wind.bcode.demo.summary.strategy.Strategy;
import com.wind.bcode.demo.summary.strategy.StrategyFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: wallet
 * @description: 充值
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
@Strategy(values = "RECHARGE")
public class RechargeCashierHandlerImpl implements IWalletCashierHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private StrategyFactory strategyFactory;

    @Resource
    private ReChargeSuccEventPublisher reChargeSuccEventPublisher;

    public void handleCashier(WalletCashierTxDTO walletCashierTxDto){
        logger.info("执行充值操作{}",walletCashierTxDto);
        WalletRechargeTxDTO recharge = WalletRechargeConverter.INSTANCE.convertToWalletRecharge(walletCashierTxDto);
        //执行不同的通道策略完成充值
        strategyFactory.getStrategy(recharge.getChannelEnum().name(), IWalletRechargeChannel.class)
                .recharge(recharge);

        // 充值成功发布事件
        reChargeSuccEventPublisher.publishReChargeSuccEvent(recharge);
    }
}
