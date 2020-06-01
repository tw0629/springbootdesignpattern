package com.tian.designpattern.observerPattern.EventBus_demo3.event;

import com.tian.designpattern.observerPattern.EventBus_demo3.refer.TradeAccount;
import com.tian.designpattern.observerPattern.EventBus_demo3.refer.TradeType;

import java.util.Date;

/**
 * @author David Tian
 * @desc 事件类
 * @since 2019-08-01 11:30
 */
public class TradeAccountEvent {
    private double amount;
    private Date tradeExecutionTime;
    private TradeType tradeType;
    private TradeAccount tradeAccount;

    public TradeAccountEvent(TradeAccount account, double amount,Date tradeExecutionTime, TradeType tradeType) {
        this.amount = amount;
        this.tradeExecutionTime = tradeExecutionTime;
        this.tradeAccount = account;
        this.tradeType = tradeType;
    }
}