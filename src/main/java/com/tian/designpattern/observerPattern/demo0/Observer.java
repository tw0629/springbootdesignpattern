package com.tian.designpattern.observerPattern.demo0;

/**
 * @author David Tian
 * @since 2019-07-31
 */
public interface Observer {

    /**

     * 更新接口

     * @param state    更新的状态

     */

    public void update(String state);

}