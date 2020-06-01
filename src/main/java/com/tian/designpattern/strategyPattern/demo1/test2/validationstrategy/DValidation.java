package com.tian.designpattern.strategyPattern.demo1.test2.validationstrategy;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;
import org.springframework.core.annotation.Order;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:40
 */
@StrategyIdentifier(identifyCode = "2")
@StrategyIdentifier(identifyCode = "3")
@Order(1)
public class DValidation implements Validation{
    @Override
    public void validate() {
        System.out.println("DDDDD");
    }
}
