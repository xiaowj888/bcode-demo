package com.wind.bcode.demo.summary.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: wallet
 * @description: 积分管理
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Service
public class UserPointManageService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void giveUserPoint(String msg){
        logger.info("赠送用户积分{}",msg);
    }
}
