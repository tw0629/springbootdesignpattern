package com.tian.designpattern.strategyPattern.demo0.stategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 01:13
 */
@com.tian.designpattern.strategyPattern.demo0.annotation.Strategy(name="StrategyB")
public class ConcreteStrategyB implements Strategy {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteStrategyB.class);

    @Override
    public void strategy(String input) {
        LOG.info("Strategy B for input : {}", input);
    }

}