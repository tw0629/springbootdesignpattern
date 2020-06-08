package com.tian.designpattern.prototypePattern.demo0;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author David Tian
 * @desc
 * @since 2020-06-07 17:41
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());



        //自己瞎测试
        Circle circle = new Circle();
        System.out.println("=======>" + circle.clone());
        Square square = new Square();
        System.out.println("=======>" + square.clone());
        Rectangle rectangle = new Rectangle();
        System.out.println("=======>" + rectangle.clone());

        System.out.println("=======>");

        new Object();

    }
}