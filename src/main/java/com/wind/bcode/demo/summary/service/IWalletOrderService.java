package com.wind.bcode.demo.summary.service;

import com.wind.bcode.demo.summary.dto.req.WalletOrderSubmitReq;

/**
 * @program: wallet
 * @description: 钱包订单服务接口
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public interface IWalletOrderService {

    /**
     * 提交订单
     * @param request 订单请求参数
     */
    void submitOrder(WalletOrderSubmitReq request);

    /**
     * 提交订单
     * @param orderReqNo 订单请求单号
     */
    void queryOrderWithReqNo(String orderReqNo);

    /**
     * 提交订单
     * @param orderNo 订单号
     */
    void queryOrderWithOrderNo(String orderNo);
}
