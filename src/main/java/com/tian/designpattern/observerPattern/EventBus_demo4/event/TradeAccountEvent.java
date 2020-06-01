package com.tian.designpattern.observerPattern.EventBus_demo4.event;


import java.util.Date;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:52
 */
/**
 *  不管什么时候买卖交易执行， 都会产生一个TradeAccountEvent实例
 */
public class TradeAccountEvent {

    private double amount;
    private Date tradeExecutionTime;
    private String tradeType;
    private String tradeAccount;

    public TradeAccountEvent(String account, double amount, Date tradeExecutionTime, String tradeType) {
        this.amount = amount;
        this.tradeExecutionTime =tradeExecutionTime;
        this.tradeAccount = account;
        this.tradeType = tradeType;

    }


}
