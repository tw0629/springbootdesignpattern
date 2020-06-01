package com.tian.designpattern.responsibilityChainPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-18 21:30
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}