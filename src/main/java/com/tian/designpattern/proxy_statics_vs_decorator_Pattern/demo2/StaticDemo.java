package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 16:07
 */
public class StaticDemo {

    public static void main(String[] args) {
        Boxer realBoxer = new BoxerImpl();
        Boxer agent = new Agent(realBoxer);


        System.out.println("=====>准备比赛");
        System.out.println("        ");
        agent.fight();
        System.out.println("        ");
        System.out.println("=====>比赛结束");


        System.out.println("======================================        ");
        //===================
        Boxer realBoxer2 = new BoxerImpl();
        BoxerInReallyFastShoes boxerInReallyFastShoes = new BoxerInReallyFastShoes(realBoxer2);
        Boxer agent2 = new Agent(boxerInReallyFastShoes);
        System.out.println("准备比赛！");
        System.out.println("        ");
        boxerInReallyFastShoes.moveFast();
        //agent2.fight();
        System.out.println("        ");
        System.out.println("比赛结束");

    }
}
