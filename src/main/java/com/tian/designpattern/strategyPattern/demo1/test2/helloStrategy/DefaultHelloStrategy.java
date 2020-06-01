package com.tian.designpattern.strategyPattern.demo1.test2.helloStrategy;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.DefaultStrategy;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:53
 */
@DefaultStrategy
public class DefaultHelloStrategy implements HelloStrategy{
    @Override
    public String hello() {
        return "default";
    }
}
