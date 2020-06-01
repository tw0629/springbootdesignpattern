package com.tian.designpattern.FlyweightPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 12:54
 */
public class FlyweightPatternDemo {

    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        // 从享元工厂里去拿
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);

            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
