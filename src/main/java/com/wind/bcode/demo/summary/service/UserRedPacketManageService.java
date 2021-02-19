package com.wind.bcode.demo.summary.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: wallet
 * @description: 用户红包
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Service
public class UserRedPacketManageService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void giveUserRedPacket(String msg){
        logger.info("用户发送红包{}",msg);
    }
}
