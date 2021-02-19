package com.wind.bcode.demo.summary.builder;

import com.wind.bcode.demo.summary.domain.WalletOrderDO;
import com.wind.bcode.demo.summary.dto.req.WalletOrderSubmitReq;
import org.springframework.stereotype.Component;

/**
 * @program: wallet
 * @description:构建订单
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
public class WalletOrderBuilder {
    public WalletOrderDO buildWalletOrder(WalletOrderSubmitReq request){
        WalletOrderDO walletOrder = new WalletOrderDO();
        walletOrder.setOrderNo("orderNo001");
        walletOrder.setOrderAmt(10L);
        walletOrder.setOrderReqNo(request.getOrderReqNo());
        walletOrder.setAccountNo(request.getAccountNo());
        walletOrder.setWalletOrderTxType(request.getOrderTxType().name());
        walletOrder.setCashierTxType(request.getCashierTxTypeEnum().name());
        walletOrder.setChannelEnum(request.getChannelEnum());
        return walletOrder;
    }
}
