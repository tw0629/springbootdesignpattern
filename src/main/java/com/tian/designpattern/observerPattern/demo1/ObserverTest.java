package com.tian.designpattern.observerPattern.demo1;

import com.tian.designpattern.observerPattern.demo1.subject.ProductObservable;
import com.tian.designpattern.observerPattern.demo1.observer.ProductNameChange;
import com.tian.designpattern.observerPattern.demo1.observer.RiskLevelChange;
import org.junit.Before;
import org.junit.Test;

/**
 * ###测试类
 *
 * @author David Tian
 * @since 2019-07-19
 */
public class ObserverTest {

    private ProductObservable productObservable = new ProductObservable();

    @Before
    public void init(){
        new ProductNameChange(productObservable);
        new RiskLevelChange(productObservable);
    }

    @Test
    public void changeTest(){
        productObservable.propertyChange("riskLevel","test");
        System.out.println("-------------------------------");
        productObservable.propertyChange("productName", "ipolaris");
    }
}