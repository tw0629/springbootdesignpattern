package com.tian.designpattern.prototypePattern.demo0;

/**
 * @author David Tian
 * @desc
 * @since 2020-06-07 17:40
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
