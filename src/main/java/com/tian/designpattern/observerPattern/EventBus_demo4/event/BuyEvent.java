package com.tian.designpattern.observerPattern.EventBus_demo4.event;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-01 16:53
 */

import java.util.Date;

/**
 * 购买事件
 * @author wenniuwuren
 *
 */
public class BuyEvent extends TradeAccountEvent {

    public BuyEvent(String tradeAccount, double amount, Date tradExecutionTime) {
        super(tradeAccount, amount, tradExecutionTime, "BUY");
    }
}