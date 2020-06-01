package com.tian.designpattern.observerPattern.EventBus_demo4.event;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:54
 */

import java.util.Date;

/**
 * 销售事件
 * @author wenniuwuren
 *
 */
public class SellEvent extends TradeAccountEvent {

    public SellEvent(String tradeAccount, double amount, Date tradExecutionTime) {
        super(tradeAccount, amount, tradExecutionTime, "SELL");
    }
}