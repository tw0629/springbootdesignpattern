package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.decorator;

import com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 17:09
 */
public class SubjectPostDecorator implements ISubject {

    private static final Logger LOG = LoggerFactory.getLogger(SubjectPostDecorator.class);

    private ISubject subject;

    public SubjectPostDecorator(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        subject.action();
        postAction();
    }

    private void postAction() {
        LOG.info("SubjectPostDecorator.preAction()");
    }

}
