package com.wind.bcode.demo.summary.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: wallet
 * @description: 用户提醒服务
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Service
public class UserNotifyService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void notifyUser(String msg){
        logger.info("通知用户订单完成{}",msg);
    }
}
