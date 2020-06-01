package com.tian.designpattern.strategyPattern.demo0.client;

import com.tian.designpattern.strategyPattern.demo0.context.SimpleContext;
import com.tian.designpattern.strategyPattern.demo0.stategy.ConcreteStrategyA;
import com.tian.designpattern.strategyPattern.demo0.stategy.Strategy;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 01:31
 */
public class SimpleClient {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        SimpleContext context = new SimpleContext(strategy);
        context.action("Hellow, world");
    }

}