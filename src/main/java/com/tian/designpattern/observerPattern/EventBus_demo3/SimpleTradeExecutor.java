package com.tian.designpattern.observerPattern.EventBus_demo3;

import com.google.common.eventbus.EventBus;
import com.tian.designpattern.observerPattern.EventBus_demo3.event.BuyEvent;
import com.tian.designpattern.observerPattern.EventBus_demo3.event.SellEvent;
import com.tian.designpattern.observerPattern.EventBus_demo3.event.TradeAccountEvent;
import com.tian.designpattern.observerPattern.EventBus_demo3.listener.AllTradesAuditor;
import com.tian.designpattern.observerPattern.EventBus_demo3.refer.TradeAccount;
import com.tian.designpattern.observerPattern.EventBus_demo3.refer.TradeType;

import java.util.Date;

/**
 * @author David Tian
 * @desc  https://my.oschina.net/indestiny/blog/219421
 * @since 2019-08-01 11:32
 */
/**
 * 执行交易, 即发布者
 */
public class SimpleTradeExecutor {

    private EventBus eventBus;

    public SimpleTradeExecutor(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    /**
     * 执行交易
     */
    public void executeTrade(TradeAccount tradeAccount, double amount, TradeType tradeType) {

        TradeAccountEvent tradeAccountEvent = processTrade(tradeAccount,amount, tradeType);
        // 发布事件
        eventBus.post(tradeAccountEvent);
    }

    /**
     * 处理交易
     *
     * @return 交易事件
     */
    private TradeAccountEvent processTrade(TradeAccount tradeAccount,double amount, TradeType tradeType) {

        Date executionTime = new Date();
        String message = String.format("Processed trade for %s of amount %n type %s @ %s",tradeAccount, amount, tradeType, executionTime);
        TradeAccountEvent tradeAccountEvent;
        if (tradeType.equals(TradeType.BUY)) {
            //购买动作
            tradeAccountEvent = new BuyEvent(tradeAccount, amount,executionTime);
        } else {
            //卖出动作
            tradeAccountEvent = new SellEvent(tradeAccount, amount,executionTime);
        }
        System.out.println("处理交易:"+message);
        return tradeAccountEvent;
    }


    /**
     * 测试测试
     *
     * @param args
     */
    public static void main(String[] args){
        EventBus eventBus = new EventBus();
        AllTradesAuditor auditor = new AllTradesAuditor(eventBus);
        SimpleTradeExecutor tradeExecutor = new SimpleTradeExecutor(eventBus);

        tradeExecutor.executeTrade(new TradeAccount(), 1000, TradeType.SELL);
        tradeExecutor.executeTrade(new TradeAccount(), 2000, TradeType.BUY);
    }

}