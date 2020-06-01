package com.tian.designpattern.strategyPattern.demo1.strategyTool.exception;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:08
 */
public class StrategyException extends RuntimeException{

    public StrategyException() {
    }

    public StrategyException(String message) {
        super(message);
    }

    public StrategyException(String message, Throwable cause) {
        super(message, cause);
    }

    public StrategyException(Throwable cause) {
        super(cause);
    }

    public StrategyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
