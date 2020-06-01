package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo1;

import java.lang.reflect.Proxy;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 01:49
 */
public class ProxyTest {

    public static final String TAG = ProxyTest.class.getSimpleName();

    public static void main(String[] args) {
        // 静态代理使用
        new LeagueOfLegendsProxy(new LeagueOfLegends(), "LiuGuoQing", "qwer1234").play();

        // 动态代理使用
        DynamicProxyHandler handler = new DynamicProxyHandler(new LeagueOfLegends());
        Game proxyInstance = (Game) Proxy.newProxyInstance(LeagueOfLegends.class.getClassLoader(), LeagueOfLegends.class.getInterfaces(), handler);
        proxyInstance.play();
    }



}
