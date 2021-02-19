package com.wind.bcode.demo.summary.test;

import com.wind.bcode.demo.summary.dto.req.WalletOrderSubmitReq;
import com.wind.bcode.demo.summary.enums.WalletCashierTxTypeEnum;
import com.wind.bcode.demo.summary.enums.WalletChannelEnum;
import com.wind.bcode.demo.summary.enums.WalletOrderTxTypeEnum;
import com.wind.bcode.demo.summary.service.IWalletOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class WalletOrderServiceTest {

    @Resource
    private IWalletOrderService walletOrderService;

    @Test
    public void testSubmitOrder(){
        WalletOrderSubmitReq request = new WalletOrderSubmitReq();
        request.setOrderTxType(WalletOrderTxTypeEnum.CASHIER);
        request.setOrderAmt(10L);
        request.setOrderReqNo("outReqNo001");
        request.setAccountNo("accountNo001");
        request.setCashierTxTypeEnum(WalletCashierTxTypeEnum.RECHARGE);
        request.setChannelEnum(WalletChannelEnum.ALIPAY);
        walletOrderService.submitOrder(request);
    }

}
