package com.tian.designpattern.observerPattern.demo2.subject;

/**
 * @author David Tian
 * @since 2019-07-21
 */
public class HeadHunter extends AbstractHR {

    @Override
    public void publishJob(String job) {
        allTalents.forEach(talent -> talent.newJob(job));
    }

}