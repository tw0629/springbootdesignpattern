package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author David Tian
 * @desc    动态代理
 * @since 2020-03-19 01:48
 */
public class DynamicProxyHandler implements InvocationHandler{

    private Game mGame;

    DynamicProxyHandler(Game Game) {
        mGame = Game;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(getClass().getSimpleName() + "准备代打");
        Object invoke = method.invoke(mGame, args);
        System.out.println(getClass().getSimpleName() + "代打成功");
        return invoke;
    }
}
