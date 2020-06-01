package com.tian.designpattern.observerPattern.demo1.subject;

import com.tian.designpattern.observerPattern.demo1.observer.ProductChangeObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ###产品变更被订阅的主题
 *
 * 产品主题
 * @author David Tian
 * @since 2019-07-19
 *
 */
public class ProductObservable {
    /**
     * 观察者集合，观察者订阅关心的产品属性变更的消息
     */
    private Map<String, List<ProductChangeObserver>> observersMap = new HashMap<String, List<ProductChangeObserver>>();

    /**
     * 属性变更
     * @param propertyName
     * @param newValue
     */
    public void propertyChange(String propertyName, String newValue){
        notifyObservers(propertyName, newValue);
    }

    /**
     * 通知观察者
     * @param objectType
     * @param arg
     */
    private void notifyObservers(String objectType, String arg) {
        List<ProductChangeObserver> observers = observersMap.get(objectType);
        if (null != observers && !observers.isEmpty()){
            for (ProductChangeObserver observer : observers){
                observer.update(this, arg);
            }
        }
    }

    /**
     * 添加监听者
     * @param observer 监听者
     */
    public synchronized void addObserver(ProductChangeObserver observer){
        List<ProductChangeObserver> observers = observersMap.get(observer.propertyName());
        if (null == observers){
            observers = new ArrayList<ProductChangeObserver>();
            observersMap.put(observer.propertyName(), observers);
        }
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }
}