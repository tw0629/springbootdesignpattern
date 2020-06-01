package com.tian.designpattern.FlyweightPattern.demo2;

import java.util.HashMap;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 12:53
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {

        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }
}
