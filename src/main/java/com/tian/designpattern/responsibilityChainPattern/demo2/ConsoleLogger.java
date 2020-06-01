package com.tian.designpattern.responsibilityChainPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-18 21:30
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}