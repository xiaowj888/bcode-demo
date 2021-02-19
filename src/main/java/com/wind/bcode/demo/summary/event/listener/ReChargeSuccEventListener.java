package com.wind.bcode.demo.summary.event.listener;

import com.wind.bcode.demo.summary.dto.WalletRechargeTxDTO;
import com.wind.bcode.demo.summary.enums.WalletChannelEnum;
import com.wind.bcode.demo.summary.event.ReChargeSuccEvent;
import com.wind.bcode.demo.summary.service.*;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: wallet
 * @description: 充值成功事件监听器
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
public class ReChargeSuccEventListener implements ApplicationListener<ReChargeSuccEvent> {

    @Resource
    private UserNotifyService userNotifyService;

    @Resource
    private UserPointManageService userPointManageService;

    @Resource
    private UserLuckyDrawManageService userLuckyDrawManageService;

    @Resource
    private UserRedPacketManageService userRedPacketManageService;

    @Resource
    private UserPhoneChargeManageService userPhoneChargeManageService;

    @Override
    public void onApplicationEvent(ReChargeSuccEvent event) {
        WalletRechargeTxDTO recharge = (WalletRechargeTxDTO)event.getSource();
        // 订单完成通知用户
        userNotifyService.notifyUser("订单完成");
        // 送积分
        userPointManageService.giveUserPoint("赠送积分");
        // 抽奖
        userLuckyDrawManageService.giveLuckyDraw("开始抽奖");

        // 支付宝返话费
        if(WalletChannelEnum.ALIPAY == recharge.getChannelEnum()){
            userPhoneChargeManageService.giveUserPhoneCharge("返话费");
        }

        // 微信支付送红包
        if(WalletChannelEnum.WEPAY == recharge.getChannelEnum()){
            userRedPacketManageService.giveUserRedPacket("赠送红包");
        }
    }
}
