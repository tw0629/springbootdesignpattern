package com.tian.designpattern.observerPattern.EventBus_demo4;



import com.google.common.eventbus.EventBus;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.BuyEvent;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.SellEvent;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.TradeAccountEvent;

import java.util.Date;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 17:25
 */
public class SimpleTradeExecutor {

    private EventBus eventBus;

    public SimpleTradeExecutor(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    /**
     * 执行交易
     */
    public void executeTrade(String tradeAccount, double amount, String tradeType) {

        TradeAccountEvent tradeAccountEvent = processTrade(tradeAccount,amount, tradeType);
        // 发布事件
        eventBus.post(tradeAccountEvent);
    }

    /**
     * 处理交易
     *
     * @return 交易事件
     */
    private TradeAccountEvent processTrade(String tradeAccount,double amount, String tradeType) {

        Date executionTime = new Date();
        String message = String.format("Processed trade for %s of amount %n type %s @ %s",tradeAccount, amount, tradeType, executionTime);

        TradeAccountEvent tradeAccountEvent;
        if (tradeType.equals("BUY")) {
            //购买动作
            tradeAccountEvent = new BuyEvent(tradeAccount, amount,executionTime);
        } else {
            //卖出动作
            tradeAccountEvent = new SellEvent(tradeAccount, amount,executionTime);
        }

        System.out.println("处理交易:"+message);

        return tradeAccountEvent;
    }
}
