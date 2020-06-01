package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo1;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 01:46
 */
public class LeagueOfLegends implements Game{

    @Override
    public void play() {
        System.out.println(getClass().getSimpleName() + "打野中");
    }
}
