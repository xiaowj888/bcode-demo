package com.wind.bcode.demo.summary.convert;

import com.wind.bcode.demo.summary.domain.WalletOrderDO;
import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.enums.WalletCashierTxTypeEnum;
import org.springframework.stereotype.Component;

/**
 * @program: wallet
 * @description:构建订单
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
public class WalletOrderConverter {
    public WalletCashierTxDTO convertWalletOrder(WalletOrderDO walletOrder){
        WalletCashierTxDTO cashierTxDto = new WalletCashierTxDTO();
        cashierTxDto.setCashierTxTypeEnum(WalletCashierTxTypeEnum.valueOf(walletOrder.getCashierTxType()));
        cashierTxDto.setOrderNo(walletOrder.getOrderNo());
        cashierTxDto.setOrderAmt(walletOrder.getOrderAmt());
        cashierTxDto.setAccountNo(walletOrder.getAccountNo());
        cashierTxDto.setChannelEnum(walletOrder.getChannelEnum());
        return cashierTxDto;
    }
}
