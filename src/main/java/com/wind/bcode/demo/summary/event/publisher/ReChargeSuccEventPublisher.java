package com.wind.bcode.demo.summary.event.publisher;

import com.wind.bcode.demo.summary.dto.WalletRechargeTxDTO;
import com.wind.bcode.demo.summary.event.ReChargeSuccEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: wallet
 * @description: 充值成功事件发布器
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Component
public class ReChargeSuccEventPublisher {
    @Resource
    private ApplicationEventPublisher applicationEventPublisher;
    public void publishReChargeSuccEvent(WalletRechargeTxDTO recharge){
        applicationEventPublisher.publishEvent(new ReChargeSuccEvent(recharge));
    }
}
