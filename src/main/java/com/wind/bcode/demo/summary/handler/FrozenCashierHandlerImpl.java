package com.wind.bcode.demo.summary.handler;

import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.strategy.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: wallet
 * @description: 冻结
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
@Strategy(values = "FROZEN")
public class FrozenCashierHandlerImpl implements IWalletCashierHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void handleCashier(WalletCashierTxDTO walletCashierTxDto){
        if(walletCashierTxDto.isFrozen()){
            logger.info("执行冻结操作{}",walletCashierTxDto);
        }
    }
}
