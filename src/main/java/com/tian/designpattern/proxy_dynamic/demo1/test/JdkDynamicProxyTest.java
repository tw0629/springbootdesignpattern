package com.tian.designpattern.proxy_dynamic.demo1.test;

import com.tian.designpattern.proxy_dynamic.demo1.proxy.jdkProxy.SubjectProxyHandler;
import com.tian.designpattern.proxy_dynamic.demo1.subject.ConcreteSubject;
import com.tian.designpattern.proxy_dynamic.demo1.subject.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.ProxyGenerator;
import org.apache.commons.io.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 18:52
 */
public class JdkDynamicProxyTest {

    private static final Logger LOG = LoggerFactory.getLogger(JdkDynamicProxyTest.class);

    public static void main(String[] args) throws IOException {
        InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
        ISubject subject =
                (ISubject) Proxy.newProxyInstance(JdkDynamicProxyTest.class.getClassLoader(),
                        new Class[] {ISubject.class}, handler);
        subject.action();
        LOG.info("+++ jdkD ===> Proxy class name {}", subject.getClass().getName());


        //会在根目录 生成一个名叫$Proxy18 .class 文件
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy19", ConcreteSubject.class.getInterfaces());
        try(OutputStream outputStream = new FileOutputStream("$Proxy19.class")){
        //try(OutputStream outputStream = new FileOutputStream("src/main/java/com/tian/designpattern/proxy_dynamic/demo1/proxy/jdkProxy/$Proxy18.class")){
            IOUtils.write(classFile, outputStream);
        }
    }

}
