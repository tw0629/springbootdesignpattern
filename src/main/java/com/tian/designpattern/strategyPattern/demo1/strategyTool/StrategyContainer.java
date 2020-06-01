package com.tian.designpattern.strategyPattern.demo1.strategyTool;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:16
 */
public interface StrategyContainer<T> {

    T getStrategy(String identifyCode);

    void register(String identifyCode,T strategy);

}