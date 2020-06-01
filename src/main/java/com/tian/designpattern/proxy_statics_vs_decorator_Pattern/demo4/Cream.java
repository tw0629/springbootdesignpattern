package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo4;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 15:49
 */
public class Cream extends Food {

    private Food basic_food;

    public Cream(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make()+"+奶油";
    }
}

