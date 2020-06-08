package com.tian.designpattern.prototypePattern.demo0;

/**
 * @author David Tian
 * @desc
 * @since 2020-06-07 17:37
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //记住这是java.lang.Object#clone()
    @Override
    public Object clone() {
        Object clone = null;
        try {

            clone = super.clone();

            //自己瞎测试
            System.out.println("=======>"+super.toString());
            System.out.println("=======>"+super.clone());
            System.out.println("=======>"+clone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}