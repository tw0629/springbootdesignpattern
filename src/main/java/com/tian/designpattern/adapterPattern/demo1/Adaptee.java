package com.tian.designpattern.adapterPattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc    待适配类
 * @since 2020-03-27 11:12
 */
public class Adaptee {

    private static Logger LOGGER = LoggerFactory.getLogger(ConcreteTarget.class);

    public void onRequest() {
        LOGGER.info("Adaptee.onRequest()");
    }

}
