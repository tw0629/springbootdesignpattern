package com.tian.designpattern.FlyweightPattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 12:31
 */
public class UnSharedFlyWeight implements FlyWeight {

    private static final Logger LOG = LoggerFactory.getLogger(UnSharedFlyWeight.class);

    private String name;

    public UnSharedFlyWeight(String name) {
        this.name = name;
    }

    @Override
    public void action(String externalState) {
        LOG.info("name = {}, outerState = {}", this.name, externalState);
    }

}
