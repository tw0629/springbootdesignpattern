package com.tian.designpattern.proxy_dynamic.demo1.test;

import com.tian.designpattern.proxy_dynamic.demo1.proxy.staticProxy.ProxySubject;
import com.tian.designpattern.proxy_dynamic.demo1.subject.ISubject;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 18:55
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        ISubject subject = new ProxySubject();
        subject.action();
    }

}