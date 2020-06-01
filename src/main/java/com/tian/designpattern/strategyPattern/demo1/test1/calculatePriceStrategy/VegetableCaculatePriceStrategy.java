package com.tian.designpattern.strategyPattern.demo1.test1.calculatePriceStrategy;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:27
 */
@StrategyIdentifier(identifyCode = "VEGETABLE")
public class VegetableCaculatePriceStrategy implements CalculatePriceStrategy{

    public Integer calculate(String sku, Integer unitPrice, Integer num) {
        System.out.println("没有优惠");
        return unitPrice*num;
    }
}
