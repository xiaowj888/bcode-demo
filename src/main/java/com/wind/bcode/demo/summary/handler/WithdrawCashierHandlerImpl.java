package com.wind.bcode.demo.summary.handler;

import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.strategy.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: wallet
 * @description: 提现
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
@Strategy(values = "WITHDRAW")
public class WithdrawCashierHandlerImpl implements IWalletCashierHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void handleCashier(WalletCashierTxDTO walletCashierTxDto){
        if(walletCashierTxDto.isWithDraw()){
            logger.info("执行提现操作{}",walletCashierTxDto);
        }
    }
}
