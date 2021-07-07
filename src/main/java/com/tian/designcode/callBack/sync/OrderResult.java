package com.tian.designcode.callBack.sync;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 17:04
 */
public interface OrderResult {

    /**
     * 订购货物的状态
     *
     * @param state
     * @return
     * desc: 参数可以不用, 用不用按照自己的实际需求决定
     */
    public String getOrderResult(String state);
}
