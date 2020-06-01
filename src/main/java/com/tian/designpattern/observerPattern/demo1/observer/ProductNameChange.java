package com.tian.designpattern.observerPattern.demo1.observer;

import com.tian.designpattern.observerPattern.demo1.subject.ProductObservable;

/**
 * ###产品名称变更的观察者
 *
 * @author David Tian
 * @since 2019-07-19
 */
public class ProductNameChange extends ProductChangeObserver {

    public ProductNameChange(ProductObservable observable){
        observable.addObserver(this);
    }

    @Override
    public String propertyName() {
        return "productName";
    }

    @Override
    public void process(String newValue) {
        System.out.println("new product name is " + newValue);
    }
}