package com.tian.designpattern.observerPattern.demo2.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @since 2019-07-21
 */
public class JuniorEngineer implements ITalent {

    private static final Logger LOG = LoggerFactory.getLogger(JuniorEngineer.class);

    @Override
    public void newJob(String job) {
        LOG.info("Junior engineer get new position {}", job);
        System.out.println("========JuniorEngineer=======>job:"+job);
        System.out.println("                                      ");
    }

}