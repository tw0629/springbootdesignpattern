package com.tian.designcode.template;

/**
 * @author David Tian
 * @desc 二 使用回调的方式实现模板
 * @since 2021-01-02 16:05
 */
public interface Callback<V,T> {

    /**
     * 模板方法
     */
    public V doSomething(T t);

}
