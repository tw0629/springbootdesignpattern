package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.decorator;

import com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 17:08
 */
public class SubjectPreDecorator implements ISubject {

    private static final Logger LOG = LoggerFactory.getLogger(SubjectPreDecorator.class);

    private ISubject subject;

    public SubjectPreDecorator(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        preAction();
        subject.action();
    }

    private void preAction() {
        LOG.info("SubjectPreDecorator.preAction()");
    }

}
