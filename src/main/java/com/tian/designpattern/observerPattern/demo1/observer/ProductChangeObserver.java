package com.tian.designpattern.observerPattern.demo1.observer;

import com.tian.designpattern.observerPattern.demo1.subject.ProductObservable;

/**
 * ###一个观察者的抽象类
 *
 * @author David Tian
 * @since 2019-07-19
 */
public abstract class ProductChangeObserver {
    /**
     * 属性名
     * @return
     */
    public abstract String propertyName();

    /**
     * 处理逻辑
     * @param newValue 新值
     */
    abstract void process(String newValue);

    /**
     * 观察者接收消息，执行变更
     * @param o
     * @param arg
     */
    public void update(ProductObservable o, String arg) {
        process(arg);
    }
}