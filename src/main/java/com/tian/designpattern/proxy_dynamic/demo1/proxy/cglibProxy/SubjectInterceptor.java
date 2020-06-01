package com.tian.designpattern.proxy_dynamic.demo1.proxy.cglibProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 18:45
 */
public class SubjectInterceptor implements MethodInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(SubjectInterceptor.class);

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
            throws Throwable {
        preAction();
        Object result = proxy.invokeSuper(obj, args);
        postAction();
        return result;
    }

    private void preAction() {
        LOG.info("cglib ===> SubjectProxyHandler.preAction()");
    }

    private void postAction() {
        LOG.info("cglib ===> SubjectProxyHandler.postAction()");
    }

}
