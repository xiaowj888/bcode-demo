package com.wind.bcode.demo.summary.service;

import com.wind.bcode.demo.summary.builder.WalletOrderBuilder;
import com.wind.bcode.demo.summary.convert.WalletOrderConverter;
import com.wind.bcode.demo.summary.dao.IWalletOrderDao;
import com.wind.bcode.demo.summary.domain.WalletOrderDO;
import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.dto.req.WalletOrderSubmitReq;
import com.wind.bcode.demo.summary.handler.IWalletCashierHandler;
import com.wind.bcode.demo.summary.strategy.StrategyFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WalletOrderServiceImpl implements IWalletOrderService{
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private WalletOrderBuilder walletOrderBuilder;

    @Resource
    private WalletOrderConverter walletOrderConverter;

    @Resource
    private IWalletOrderDao walletOrderDao;

    @Resource
    private StrategyFactory strategyFactory;


    @Override
    public void submitOrder(WalletOrderSubmitReq request) {
        // 构建钱包订单
        WalletOrderDO walletOrderDO = walletOrderBuilder.buildWalletOrder(request);
        // 保存订单
        walletOrderDao.insert(walletOrderDO);
        // 转换得到现金操作DTO
        WalletCashierTxDTO walletCashierTxDto = walletOrderConverter.convertWalletOrder(walletOrderDO);
        if(null == walletCashierTxDto) {
            return;
        }
        strategyFactory.getStrategy(walletCashierTxDto.getCashierTxTypeEnum().name(), IWalletCashierHandler.class)
                .handleCashier(walletCashierTxDto);

    }
    @Override
    public void queryOrderWithReqNo(String orderReqNo) {
    }
    @Override
    public void queryOrderWithOrderNo(String orderNo) {
    }
}
