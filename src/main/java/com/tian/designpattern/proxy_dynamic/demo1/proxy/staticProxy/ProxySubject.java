package com.tian.designpattern.proxy_dynamic.demo1.proxy.staticProxy;

import com.tian.designpattern.proxy_dynamic.demo1.subject.ConcreteSubject;
import com.tian.designpattern.proxy_dynamic.demo1.subject.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 18:46
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
        subject.action();
        postAction();
    }

    public void preAction() {
        LOG.info("ProxySubject.preAction()");
    }

    public void postAction() {
        LOG.info("ProxySubject.postAction()");
    }

}
