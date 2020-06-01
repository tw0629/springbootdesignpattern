package com.tian.designpattern.observerPattern.EventBus_demo4.listener;

import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.BuyEvent;

import java.util.List;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:55
 */
/**
 * 购买审查
 * @author wenniuwuren
 *
 */
public class TradeBuyAuditor {

    private List<BuyEvent> buyEvents = Lists.newArrayList();

    public TradeBuyAuditor(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe
    public void auditBuy(BuyEvent buyEvent) {
        buyEvents.add(buyEvent);
        System.out.println("YYY--TradeBuyAuditor--YYY    Received TradeBuyEvent " + buyEvent);
    }

    public List<BuyEvent> getBuyEvents() {
        return buyEvents;
    }

}