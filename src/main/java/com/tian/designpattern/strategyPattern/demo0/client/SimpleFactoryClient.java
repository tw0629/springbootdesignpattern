package com.tian.designpattern.strategyPattern.demo0.client;

import com.tian.designpattern.strategyPattern.demo0.context.SimpleFactoryContext;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 01:31
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        SimpleFactoryContext context = new SimpleFactoryContext();
        context.action("Hellow, world");
    }

}
