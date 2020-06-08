package com.tian.designpattern.prototypePattern.demo0;

/**
 * @author David Tian
 * @desc
 * @since 2020-06-07 17:40
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
