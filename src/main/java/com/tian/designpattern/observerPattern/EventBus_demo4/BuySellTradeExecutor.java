package com.tian.designpattern.observerPattern.EventBus_demo4;

import com.google.common.eventbus.EventBus;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.BuyEvent;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.SellEvent;
import com.tian.designpattern.observerPattern.EventBus_demo4.event.TradeAccountEvent;

import java.util.Date;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:54
 */
/**
 * 分类型（SELL BUY）执行器
 * @author wenniuwuren
 *
 */
public class BuySellTradeExecutor {

    private EventBus eventBus;

    public BuySellTradeExecutor(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void executeTrade(String tradeAccount, double amount, String tradeType) {
        TradeAccountEvent tradeAccountEvent = processTrade(tradeAccount, amount, tradeType);
        // 发布, 通知订阅者
        eventBus.post(tradeAccountEvent);
    }

    private TradeAccountEvent processTrade(String tradeAccount, double amount, String tradeType) {

        Date executionTime = new Date();
        String message = String.format("Processed trade for" + tradeAccount + "of amount" + amount + "type" + tradeType + "@" + executionTime);

        TradeAccountEvent tradeAccountEvent;
        if (tradeType.equals("BUY")) {
            tradeAccountEvent = new BuyEvent(tradeAccount, amount, executionTime);
        } else {
            tradeAccountEvent = new SellEvent(tradeAccount, amount, executionTime);
        }

        System.out.println(message);

        return tradeAccountEvent;
    }


}