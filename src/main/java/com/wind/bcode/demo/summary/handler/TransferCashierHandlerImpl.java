package com.wind.bcode.demo.summary.handler;

import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.strategy.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: wallet
 * @description: 转账
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
@Strategy(values = "TRANSFER")
public class TransferCashierHandlerImpl implements IWalletCashierHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void handleCashier(WalletCashierTxDTO walletCashierTxDto){
        if(walletCashierTxDto.isTransfer()){
            logger.info("执行转账操作{}",walletCashierTxDto);
        }
    }
}
