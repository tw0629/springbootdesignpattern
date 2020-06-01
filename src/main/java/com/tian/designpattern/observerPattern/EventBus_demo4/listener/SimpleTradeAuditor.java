package com.tian.designpattern.observerPattern.EventBus_demo4.listener;

import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.TradeAccountEvent;

import java.util.List;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:55
 */
/**
 * 审核交易
 */
public class SimpleTradeAuditor {

    private List<TradeAccountEvent> tradeEvents = Lists.newArrayList();

    public SimpleTradeAuditor(EventBus eventBus) {
        // 注册， 以便获取TradeAccountEvent的通知
        eventBus.register(this);
    }

    /**
     * 事件处理（用@Subscribe注解表示）
     * @param tradeAccountEvent
     */

    @Subscribe
    public void auditTrade(TradeAccountEvent tradeAccountEvent) {
        tradeEvents.add(tradeAccountEvent);
        System.out.println("XXX--SimpleTradeAuditor--XXX    Received trade " + tradeAccountEvent);
    }
}