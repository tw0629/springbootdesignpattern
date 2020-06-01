package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 16:50
 */
public class BoxerInReallyFastShoes implements Boxer{

    Boxer boxer;

    public BoxerInReallyFastShoes(Boxer boxer) {
        this.boxer = boxer;
    }

    void moveFast(){
        System.out.println("穿上非常快的鞋：移速+5");
    }

    @Override
    public void fight() {
        boxer.fight();
    }
}
