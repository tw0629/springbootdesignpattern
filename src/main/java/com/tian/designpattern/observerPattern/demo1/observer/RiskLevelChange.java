package com.tian.designpattern.observerPattern.demo1.observer;

import com.tian.designpattern.observerPattern.demo1.observer.ProductChangeObserver;
import com.tian.designpattern.observerPattern.demo1.subject.ProductObservable;

/**
 * ###安全等级变更的观察者
 *
 * @author David Tian
 * @since 2019-07-19
 */
public class RiskLevelChange extends ProductChangeObserver {

    public RiskLevelChange(ProductObservable observable){
        observable.addObserver(this);
    }

    @Override
    public String propertyName() {
        return "riskLevel";
    }

    @Override
    public void process(String newValue) {
        System.out.println("new risk level is " + newValue);
    }
}
