package com.tian.designpattern.observerPattern.EventBus_demo4;

import com.google.common.eventbus.EventBus;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.BuyEvent;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.SellEvent;
import com.tian.designpattern.observerPattern.EventBus_demo4.listener.AllTradesAuditor;
import com.tian.designpattern.observerPattern.EventBus_demo4.listener.SimpleTradeAuditor;
import com.tian.designpattern.observerPattern.EventBus_demo4.listener.TradeBuyAuditor;
import com.tian.designpattern.observerPattern.EventBus_demo4.listener.TradeSellAuditor;

import java.util.Date;

/**
 * @author David Tian
 * @desc  https://my.oschina.net/u/1024107/blog/747498
 * @since 2019-08-01 19:08
 */
public class Client {

    public static void main(String[] args) {

        // 消费者和生产者根据EventBus对象来一一对应
        EventBus eventBus1 = new EventBus();
        //SimpleTradeAuditor simpleTradeAuditor = new SimpleTradeAuditor(eventBus1);
        //register
        SimpleTradeExecutor simpleTradeExecutor = new SimpleTradeExecutor(eventBus1);
        //post
        simpleTradeExecutor.executeTrade("zhangsan", 10, "Money");

        System.out.println("----This is devil dividing line------");

        EventBus eventBus2 = new EventBus();
        AllTradesAuditor allTradesAuditor = new AllTradesAuditor(eventBus2);
        //register
        BuySellTradeExecutor buySellTradeExecutor = new BuySellTradeExecutor(eventBus2);
        //post
        buySellTradeExecutor.executeTrade("ttttt", 100, "SELL");
        System.out.println("    ---------------------");
        buySellTradeExecutor.executeTrade("wwwww", 1000, "BUY");


        System.out.println("    ---------------------");
        System.out.println("    ");
        EventBus eventBus3 = new EventBus();
        TradeBuyAuditor tradeBuyAuditor = new TradeBuyAuditor(eventBus3);
        BuyEvent buyEvent = new BuyEvent("tian",8.8,new Date());
        eventBus3.post(buyEvent);


        System.out.println("    ---------------------");
        System.out.println("    ");
        EventBus eventBus4 = new EventBus();
        TradeSellAuditor tradeSellAuditor = new TradeSellAuditor(eventBus4);
        SellEvent sellEvent = new SellEvent("wei",6.6,new Date());
        eventBus4.post(sellEvent);

        System.out.println("    ----------end-----------   ");

    }
}
