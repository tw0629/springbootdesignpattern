package com.tian.designpattern.componentPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 18:19
 */
public abstract class File {

    String name;

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();

}
