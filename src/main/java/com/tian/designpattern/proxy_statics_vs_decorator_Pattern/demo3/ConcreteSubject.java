package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 17:06
 */
public class ConcreteSubject implements ISubject{

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteSubject.class);

    @Override
    public void action() {
        LOG.info("ConcreteSubject action()");
    }
}
