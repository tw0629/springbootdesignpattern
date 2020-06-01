package com.tian.designpattern.observerPattern.demo2.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @since 2019-07-21
 */
public class Architect implements ITalent {

    private static final Logger LOG = LoggerFactory.getLogger(Architect.class);

    @Override
    public void newJob(String job) {
        LOG.info("Architect get new position {}", job);
        System.out.println("========Architect=======>job:"+job);
        System.out.println("                                      ");
    }

}