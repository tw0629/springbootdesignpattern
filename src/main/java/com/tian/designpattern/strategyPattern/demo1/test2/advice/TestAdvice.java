package com.tian.designpattern.strategyPattern.demo1.test2.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:59
 */
public class TestAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("test");
    }
}
