package com.wind.bcode.demo.summary.event;

import com.wind.bcode.demo.summary.dto.WalletRechargeTxDTO;
import org.springframework.context.ApplicationEvent;

/**
 * @program: wallet
 * @description: 充值成功事件
 * @author: xiaowj
 * @created: 2021-01-31
 **/
public class ReChargeSuccEvent extends ApplicationEvent {
    public ReChargeSuccEvent(WalletRechargeTxDTO source) {
        super(source);
    }
}
