package com.wind.bcode.demo.summary.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: wallet
 * @description: 用户抽奖
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Service
public class UserLuckyDrawManageService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void giveLuckyDraw(String msg){
        logger.info("用户抽奖{}",msg);
    }
}
