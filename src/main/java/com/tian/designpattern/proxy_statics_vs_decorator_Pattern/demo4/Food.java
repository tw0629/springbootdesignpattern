package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo4;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 15:48
 */
public class Food {

    private String food_name;

    public Food() {
    }

    public Food(String food_name) {
        this.food_name = food_name;
    }

    public String make() {
        return food_name;
    };
}