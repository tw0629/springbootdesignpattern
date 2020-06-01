package com.tian.designpattern.adapterPattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc 适配器类
 * @since 2020-03-27 11:12
 */
public class Adapter implements ITarget {

    private static Logger LOG = LoggerFactory.getLogger(Adapter.class);

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        LOG.info("Adapter.request");
        adaptee.onRequest();
    }

}
