package com.tian.designpattern.prototypePattern.demo0;

/**
 * @author David Tian
 * @desc
 * @since 2020-06-07 17:40
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}