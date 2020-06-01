package com.tian.designpattern.strategyPattern.demo1.test1.calculatePriceStrategy;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:26
 */
@StrategyIdentifier(identifyCode = "FRUIT")
public class FruitCalculatePriceStrategy implements CalculatePriceStrategy{

    @Override
    public Integer calculate(String sku, Integer unitPrice, Integer num) {
        System.out.println("满2件，打8折");
        if(num <2){
            return unitPrice*num;
        }else{
            return unitPrice*num*8/10;
        }
    }
}
