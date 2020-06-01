package com.tian.designpattern.templatePattern.demo1;

/**
 * @author David Tian
 * @desc https://www.runoob.com/design-pattern/template-pattern.html
 * @since 2020-03-18 23:31
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}
