package com.wind.bcode.demo.summary.convert;

import com.wind.bcode.demo.summary.dto.WalletCashierTxDTO;
import com.wind.bcode.demo.summary.dto.WalletRechargeTxDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @program: wallet
 * @description:钱包充值
 * @author: xiaowj
 * @created: 2021-01-31
 **/
@Mapper
public interface WalletRechargeConverter {
    WalletRechargeConverter INSTANCE =
            Mappers.getMapper(WalletRechargeConverter.class);
    WalletRechargeTxDTO convertToWalletRecharge(WalletCashierTxDTO source);
}
