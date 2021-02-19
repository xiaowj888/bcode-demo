package com.wind.bcode.demo.summary.handler;

import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.strategy.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: wallet
 * @description: 赎回
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
@Strategy(values = "REDEEM")
public class RedeemCashierHandlerImpl implements IWalletCashierHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void handleCashier(WalletCashierTxDTO walletCashierTxDto){
        if(walletCashierTxDto.isRedeem()){
            logger.info("执行赎回操作{}",walletCashierTxDto);
        }
    }
}
