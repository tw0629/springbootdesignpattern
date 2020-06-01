package com.tian.designpattern.strategyPattern.demo1.strategyTool;

import java.util.List;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:11
 */
public interface MultiStrategyContainer<T> {

    List<T> getStrategies(String identifyCode);
}
