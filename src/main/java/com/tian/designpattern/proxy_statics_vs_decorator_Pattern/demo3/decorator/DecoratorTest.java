package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.decorator;

import com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.ConcreteSubject;
import com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo3.ISubject;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 17:09
 */
public class DecoratorTest {

    public static void main(String[] args) {
        //一层一层的装饰者模型
        ISubject subject = new ConcreteSubject();
        ISubject preDecorator = new SubjectPreDecorator(subject);
        ISubject postDecorator = new SubjectPostDecorator(preDecorator);

        postDecorator.action();
    }

}
