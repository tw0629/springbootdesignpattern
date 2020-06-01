package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 16:03
 */
public class Agent implements Boxer{

    private Boxer boxer;

    public Agent(Boxer boxer) {
        this.boxer = boxer;
    }

    @Override
    public void fight() {
        //安排自己的拳手去比赛
        System.out.println("===代理做的事情===");
        findOpponent();
        findSponsor();
        negotiate();
        System.out.println("        ");

        System.out.println("===拳手继续做自己的事情===");
        boxer.fight();

    }

    void findOpponent(){
        System.out.println("代理人:寻找适用于当前拳手的对手");
    }

    void findSponsor(){
        System.out.println("代理人:寻找赞助商");
    }

    void negotiate(){
        System.out.println("代理人:洽谈");
    }
}
