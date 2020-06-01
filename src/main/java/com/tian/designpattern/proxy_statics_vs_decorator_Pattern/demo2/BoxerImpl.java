package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-19 15:59
 */
public class BoxerImpl implements Boxer{

    private String name;

    private String wins;

    private String loses;

    @Override
    public void fight() {
        Hook();
        Straight();
        Duck();
    }

    void Duck(){
        System.out.println("拳手：闪避");
    }

    void Hook(){
        System.out.println("拳手：勾拳");
    }

    void Straight(){
        System.out.println("拳手：直拳");
    }

}
