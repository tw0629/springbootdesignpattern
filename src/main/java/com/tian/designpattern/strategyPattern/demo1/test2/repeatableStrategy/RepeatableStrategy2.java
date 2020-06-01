package com.tian.designpattern.strategyPattern.demo1.test2.repeatableStrategy;

import com.tian.designpattern.strategyPattern.demo1.test2.annotation.One;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:44
 */
@One(test = "2")
public class RepeatableStrategy2 implements RepeatableStrategy {
    @Override
    public String test() {
        return "2";
    }
}
