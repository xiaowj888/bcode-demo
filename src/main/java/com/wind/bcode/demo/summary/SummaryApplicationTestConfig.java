package com.wind.bcode.demo.summary;

import com.wind.bcode.demo.summary.dao.IWalletOrderDao;
import com.wind.bcode.demo.summary.domain.WalletOrderDO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SummaryApplicationTestConfig {
    @Bean
    public IWalletOrderDao walletOrderDao(){
        return new IWalletOrderDao() {
            @Override
            public int insert(WalletOrderDO record) {
                return 1;
            }
        };
    }
}
