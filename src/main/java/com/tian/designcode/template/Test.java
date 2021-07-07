package com.tian.designcode.template;

/**
 * @author David Tian
 * @desc 二 使用回调的方式实现模板
 * @since 2021-01-02 16:06
 */
public class Test {

    public static void main(String[] args) {
        useTemplet("业务逻辑",new Callback<String, String>() {
            @Override
            public String doSomething(String t) {
                return t;
            }
        });
    }

    /**
     * 模板方法 (即固定不变的代码)
     */
    public static void useTemplet(String str,Callback<String,String> callback){

        System.out.println("固定代码");

        String result = callback.doSomething(str);
        System.out.println(result );

        System.out.println("固定代码");
    }
}
