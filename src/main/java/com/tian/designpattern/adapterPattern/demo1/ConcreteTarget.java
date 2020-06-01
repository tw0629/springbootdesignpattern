package com.tian.designpattern.adapterPattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 11:11
 */
public class ConcreteTarget implements ITarget {

    private static Logger LOG = LoggerFactory.getLogger(ConcreteTarget.class);

    @Override
    public void request() {
        LOG.info("ConcreteTarget.request()");
    }

}
