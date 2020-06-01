package com.tian.designpattern.FlyweightPattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 12:30
 */
public class FlyWeightFactory {

    //本例中，name可以认为是内部状态，在构造时确定。externalState属于外部状态，由客户端在调用时传入。
    //可以看出是内部状态作为key的

    private static final Logger LOG = LoggerFactory.getLogger(FlyWeightFactory.class);

    // 享元工厂负责创建实例并将其加入标记-对象映射
    private static ConcurrentHashMap<String, FlyWeight> allFlyWeight = new ConcurrentHashMap<String, FlyWeight>();

    public static FlyWeight getFlyWeight(String name) {

        //双重检查（Double Check）
        //1
        if (allFlyWeight.get(name) == null) {

            synchronized (allFlyWeight) {

                //2
                if (allFlyWeight.get(name) == null) {
                    LOG.info("Instance of name = {} does not exist, creating it");
                    FlyWeight flyWeight = new ConcreteFlyWeight(name);
                    LOG.info("Instance of name = {} created");
                    allFlyWeight.put(name, flyWeight);
                }
            }
        }

        return allFlyWeight.get(name);
    }

}
