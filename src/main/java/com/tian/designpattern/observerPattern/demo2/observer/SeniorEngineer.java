package com.tian.designpattern.observerPattern.demo2.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @since 2019-07-21
 */
public class SeniorEngineer implements ITalent {

    private static final Logger LOG = LoggerFactory.getLogger(SeniorEngineer.class);

    @Override
    public void newJob(String job) {
        LOG.info("Senior engineer get new position {}", job);
        System.out.println("========SeniorEngineer=======>job:"+job);
        System.out.println("                                      ");
    }

}
