package com.tian.designpattern.strategyPattern.demo1.test2.repeatableStrategy;

import com.tian.designpattern.strategyPattern.demo1.test2.annotation.One;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:47
 */
@One(test = "1")
@One(test = "3")
public class RepeatableStrategy1 implements RepeatableStrategy {
    @Override
    public String test() {
        return "1";
    }
}
