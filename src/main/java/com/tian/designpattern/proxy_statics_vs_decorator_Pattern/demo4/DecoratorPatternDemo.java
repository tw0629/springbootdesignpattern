package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo4;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 15:50
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }

}
