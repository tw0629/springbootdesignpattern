package com.tian.designpattern.proxy_dynamic.demo1.test;

import com.tian.designpattern.proxy_dynamic.demo1.proxy.cglibProxy.SubjectInterceptor;
import com.tian.designpattern.proxy_dynamic.demo1.subject.ConcreteSubject;
import com.tian.designpattern.proxy_dynamic.demo1.subject.ISubject;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 18:50
 */
public class CgLibProxyTest {

    public static void main(String[] args) {
        MethodInterceptor methodInterceptor = new SubjectInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreteSubject.class);
        enhancer.setCallback(methodInterceptor);


        ISubject subject = (ISubject)enhancer.create();
        subject.action();
    }

}
