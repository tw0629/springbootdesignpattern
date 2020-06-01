package com.tian.designpattern.observerPattern.demo2.subject;

import com.tian.designpattern.observerPattern.demo2.observer.ITalent;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author David Tian
 * @since 2019-07-21
 */
public abstract class AbstractHR {

    /**
     * 相当于一个 人才库
     */
    protected Collection<ITalent> allTalents = new ArrayList<ITalent>();

    /**
     * 发布工作职位
     * @param job
     */
    public abstract void publishJob(String job);

    /**
     * 注册求职者
     * @param talent
     */
    public void addTalent(ITalent talent) {
        allTalents.add(talent);
    }

    /**
     * 注销求职者
     * @param talent
     */
    public void removeTalent(ITalent talent) {
        allTalents.remove(talent);
    }

}