package com.tian.designpattern.observerPattern.EventBus_demo3.listener;

import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo3.event.BuyEvent;
import com.tian.designpattern.observerPattern.EventBus_demo3.event.SellEvent;

import java.util.List;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 11:31
 */
/**
 * 卖出和购买审计，即订阅者
 */
public class AllTradesAuditor {

    private List<BuyEvent> buyEvents = Lists.newArrayList();
    private List<SellEvent> sellEvents = Lists.newArrayList();

    public AllTradesAuditor(EventBus eventBus) {
        eventBus.register(this);
    }

    /**
     * 订阅卖出事件
     */
    @Subscribe
    public void auditSell(SellEvent sellEvent) {
        sellEvents.add(sellEvent);
        System.out.println("Received TradeSellEvent " + sellEvent);
    }

    /**
     * 订阅购买事件
     */
    @Subscribe
    public void auditBuy(BuyEvent buyEvent) {
        buyEvents.add(buyEvent);
        System.out.println("Received TradeBuyEvent " + buyEvent);
    }
}