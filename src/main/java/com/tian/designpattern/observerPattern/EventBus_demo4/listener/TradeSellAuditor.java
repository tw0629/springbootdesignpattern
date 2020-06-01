package com.tian.designpattern.observerPattern.EventBus_demo4.listener;

import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.SellEvent;

import java.util.List;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:55
 */
/**
 * 销售审查
 * @author wenniuwuren
 *
 */
public class TradeSellAuditor {

    private List<SellEvent> sellEvents = Lists.newArrayList();

    public TradeSellAuditor(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe
    public void auditSell(SellEvent sellEvent) {
        sellEvents.add(sellEvent);
        System.out.println("YYY--TradeSellAuditor--YYY Received SellEvent " + sellEvent);
    }

    public List<SellEvent> getSellEvents() {
        return sellEvents;
    }
}