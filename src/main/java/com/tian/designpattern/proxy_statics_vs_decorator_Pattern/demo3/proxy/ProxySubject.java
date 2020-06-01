package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.proxy;

import com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.ConcreteSubject;
import com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 17:07
 */
public class ProxySubject implements ISubject {

    private static final Logger LOG = LoggerFactory.getLogger(ProxySubject.class);

    private ISubject subject;

    public ProxySubject() {
        subject = new ConcreteSubject();
    }

    @Override
    public void action() {
        preAction();
        if((new Random()).nextBoolean()){
            subject.action();
        } else {
            LOG.info("Permission denied");
        }
        postAction();
    }

    private void preAction() {
        LOG.info("ProxySubject.preAction()");
    }

    private void postAction() {
        LOG.info("ProxySubject.postAction()");
    }

}
