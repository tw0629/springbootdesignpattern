package com.tian.designpattern.proxy_dynamic.demo1.proxy.jdkProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 18:43
 */
public class MultiProxyHandler implements InvocationHandler {

    private static final Logger LOG = LoggerFactory.getLogger(SubjectProxyHandler.class);

    private Object target;

    @SuppressWarnings("rawtypes")
    public MultiProxyHandler(Class clazz) {
        try {
            this.target = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            LOG.error("Create proxy for {} failed", clazz.getName());
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        switch(method.getName()) {
            case "hashCode":
                return ((int)method.invoke(target, args)) + 1;
            case "equals":
                return (boolean)method.invoke(target, args);
            case "toString":
                return method.invoke(target, args) + "";
            case "action":
                preAction();
                Object result = method.invoke(target, args);
                postAction();
                return result;
            default:
                return method.invoke(target, args);
        }
    }

    private void preAction() {
        LOG.info("jdkD ===> SubjectProxyHandler.preAction()");
    }

    private void postAction() {
        LOG.info("jdkD ===> SubjectProxyHandler.postAction()");
    }

}