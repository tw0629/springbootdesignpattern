package com.tian.designpattern.observerPattern.demo0;

/**
 * @author David Tian
 * @since 2019-07-31
 */
public class ConcreteObserver implements Observer {

    //观察者的状态

    private String observerState;

    @Override

    public void update(String state) {

        /**

         * 更新观察者的状态，使其与目标的状态保持一致

         */

        observerState = state;

        System.out.println("状态为："+observerState);

    }

}