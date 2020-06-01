package com.tian.designpattern.observerPattern.EventBus_demo3.event;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 11:31
 */

import com.tian.designpattern.observerPattern.EventBus_demo3.refer.TradeAccount;
import com.tian.designpattern.observerPattern.EventBus_demo3.refer.TradeType;

import java.util.Date;

/**
 * 卖出事件
 */
public class SellEvent extends TradeAccountEvent {

    public SellEvent(TradeAccount tradeAccount, double amount, Date tradExecutionTime) {
        super(tradeAccount, amount, tradExecutionTime, TradeType.SELL);
    }
}