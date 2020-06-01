package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.proxy;

import com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.ISubject;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 17:08
 */
public class StaticTest {

    public static void main(String[] args) {
        ISubject subject = new ProxySubject();
        subject.action();
    }

}
