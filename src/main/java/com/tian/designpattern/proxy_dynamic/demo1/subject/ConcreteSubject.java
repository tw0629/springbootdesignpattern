package com.tian.designpattern.proxy_dynamic.demo1.subject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 18:42
 */
public class ConcreteSubject implements ISubject {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteSubject.class);

    @Override
    public void action() {
        LOG.info("ConcreteSubject XXX ===> ConcreteSubject action()");
    }

}
