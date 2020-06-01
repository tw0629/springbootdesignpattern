package com.tian.designpattern.strategyPattern.demo1.test2.validationstrategy;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:39
 */
@StrategyIdentifier(identifyCode = "2")
@StrategyIdentifier(identifyCode = "3")
@Order(-1)
public class CValidation implements Validation , Ordered {
    @Override
    public void validate() {
        System.out.println("CCCCC");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
