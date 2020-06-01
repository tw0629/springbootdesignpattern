package com.tian.designpattern.strategyPattern.demo1.test2;

import com.tian.designpattern.strategyPattern.demo1.test2.annotation.One;
import com.tian.designpattern.strategyPattern.demo1.test2.annotation.People;
import com.tian.designpattern.strategyPattern.demo1.test2.helloStrategy.ChineseGirlHelloStrategy;
import com.tian.designpattern.strategyPattern.demo1.test2.helloStrategy.HelloStrategy;
import com.tian.designpattern.strategyPattern.demo1.test2.helloStrategy.JapanGirlHelloStrategy;
import com.tian.designpattern.strategyPattern.demo1.test2.repeatableStrategy.RepeatableStrategy1;
import com.tian.designpattern.strategyPattern.demo1.test2.repeatableStrategy.RepeatableStrategy2;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.DefaultAdvisorChainFactory;
import org.springframework.aop.framework.DefaultAopProxyFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.reflect.Method;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:56
 */
public class SpringFeatureTest {

    @Test
    public void testCglibAop() {
        DefaultAopProxyFactory defaultAopProxyFactory = new DefaultAopProxyFactory();

        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setInterfaces(HelloStrategy.class);
        advisedSupport.setTarget(new ChineseGirlHelloStrategy());
        advisedSupport.setAdvisorChainFactory(new DefaultAdvisorChainFactory());
        advisedSupport.addAdvice(new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println("test");
            }
        });
        advisedSupport.setProxyTargetClass(true);

        HelloStrategy helloStrategy = (HelloStrategy) defaultAopProxyFactory.createAopProxy(advisedSupport).getProxy();
        Assert.assertTrue(AopUtils.isAopProxy(helloStrategy));
        Assert.assertEquals(AopUtils.getTargetClass(helloStrategy),ChineseGirlHelloStrategy.class);
    }

    @Test
    public void testJDKAop(){
        DefaultAopProxyFactory defaultAopProxyFactory = new DefaultAopProxyFactory();

        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setInterfaces(HelloStrategy.class);
        advisedSupport.setTarget(new ChineseGirlHelloStrategy());
        advisedSupport.setAdvisorChainFactory(new DefaultAdvisorChainFactory());
        advisedSupport.addAdvice(new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println("test");
            }
        });
        advisedSupport.setProxyTargetClass(false);

        HelloStrategy helloStrategy = (HelloStrategy) defaultAopProxyFactory.createAopProxy(advisedSupport).getProxy();
        Assert.assertTrue(AopUtils.isAopProxy(helloStrategy));
        Assert.assertEquals(AopUtils.getTargetClass(helloStrategy),ChineseGirlHelloStrategy.class);
    }

    /**
     * AnnotationUtils.getRepeatableAnnotations兼容了Repeatable模式和非Repeatable模式
     */
    @Test
    public void testSpringAnnotationUtil(){
        Assert.assertEquals(AnnotationUtils.getRepeatableAnnotations(RepeatableStrategy1.class, One.class).size(),2);
        Assert.assertTrue(AnnotationUtils.getAnnotation(RepeatableStrategy1.class, One.class)==null);
        Assert.assertEquals(AnnotationUtils.getRepeatableAnnotations(RepeatableStrategy2.class, One.class).size(),1);
        Assert.assertTrue(AnnotationUtils.getAnnotation(RepeatableStrategy2.class, One.class)!=null);

        Assert.assertEquals(AnnotationUtils.getRepeatableAnnotations(JapanGirlHelloStrategy.class, People.class).size(),1);
    }

}
