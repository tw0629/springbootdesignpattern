package com.tian.designpattern.observerPattern.demo2;

import com.tian.designpattern.observerPattern.demo2.observer.Architect;
import com.tian.designpattern.observerPattern.demo2.observer.ITalent;
import com.tian.designpattern.observerPattern.demo2.observer.JuniorEngineer;
import com.tian.designpattern.observerPattern.demo2.observer.SeniorEngineer;
import com.tian.designpattern.observerPattern.demo2.subject.AbstractHR;
import com.tian.designpattern.observerPattern.demo2.subject.HeadHunter;

/**
 * @author David Tian
 * @since 2019-07-21
 */
public class Client1 {

    public static void main(String[] args) {
        //人才一一一观察者
        ITalent juniorEngineer = new JuniorEngineer();
        ITalent seniorEngineer = new SeniorEngineer();
        ITalent architect = new Architect();

        //添加到人才库中一一一主题
        AbstractHR subject = new HeadHunter();
        subject.addTalent(juniorEngineer);
        subject.addTalent(seniorEngineer);
        subject.addTalent(architect);

        //发布职位信息
        //subject.publishJob("Top 500 big data position");
        subject.publishJob("@所有求职者 劝大家转行到互联网    新的职位信息:程序员 一个月50K 一年16个月");
    }

}