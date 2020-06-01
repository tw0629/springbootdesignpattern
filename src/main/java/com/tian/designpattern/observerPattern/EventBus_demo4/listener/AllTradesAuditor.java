package com.tian.designpattern.observerPattern.EventBus_demo4.listener;

import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo3.event.BuyEvent;
import com.tian.designpattern.observerPattern.EventBus_demo3.event.SellEvent;

import java.util.List;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:53
 */
public class AllTradesAuditor {

    private List<BuyEvent> buyEvents = Lists.newArrayList();
    private List<SellEvent> sellEvents = Lists.newArrayList();

    public AllTradesAuditor(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe
    public void auditSell(SellEvent sellEvent) {
        sellEvents.add(sellEvent);
        System.out.println("XXX1--AllTradesAuditor--XXX     Received TradeSellEvent " + sellEvent);
    }

    @Subscribe
    public void auditBuy(BuyEvent buyEvent) {
        buyEvents.add(buyEvent);
        System.out.println("XXX2--AllTradesAuditor--XXX    Received TradeBuyEvent " + buyEvent);
    }
}
