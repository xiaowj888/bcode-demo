package com.wind.bcode.demo.summary.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: wallet
 * @description: 用户话费管理
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Service
public class UserPhoneChargeManageService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public void giveUserPhoneCharge(String msg){
        logger.info("赠送话费{}",msg);
    }
}
