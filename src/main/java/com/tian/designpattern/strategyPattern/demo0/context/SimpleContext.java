package com.tian.designpattern.strategyPattern.demo0.context;

import com.tian.designpattern.strategyPattern.demo0.stategy.Strategy;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 01:17
 */
public class SimpleContext {

    private Strategy strategy;

    public SimpleContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void action(String input) {
        strategy.strategy(input);
    }

}