package com.tian.designpattern.FlyweightPattern.demo1;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 12:32
 */
public class FlyWeightClient {

    //本例中，name可以认为是内部状态，在构造时确定。
    //      externalState属于外部状态，由客户端在调用时传入。

    public static void main(String[] args) {
        // 从享元工厂里去拿
        FlyWeight bmw1 = FlyWeightFactory.getFlyWeight("bmw");
        FlyWeight bmw2 = FlyWeightFactory.getFlyWeight("bmw");
        FlyWeight bmw3 = FlyWeightFactory.getFlyWeight("bmw");

        bmw1.action("start");
        bmw2.action("stop");
        bmw3.action("boost");

    }

}