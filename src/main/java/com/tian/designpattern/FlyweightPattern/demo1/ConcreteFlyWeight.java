package com.tian.designpattern.FlyweightPattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 12:30
 */
public class ConcreteFlyWeight implements FlyWeight {

    //本例中，name可以认为是内部状态，在构造时确定。externalState属于外部状态，由客户端在调用时传入。

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteFlyWeight.class);

    private String name;

    public ConcreteFlyWeight(String name) {
        this.name = name;
    }

    @Override
    public void action(String externalState) {
        LOG.info("name = {}, outerState = {}", this.name, externalState);
    }

}
