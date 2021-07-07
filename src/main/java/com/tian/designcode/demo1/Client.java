package com.tian.designcode.demo1;

/**
 * @author David Tian
 * @desc 策略模式
 * @since 2021-01-02 14:40
 */
public class Client {

    interface IStrategy {
        void doSomething();
    }

    static class ConcreteStrategy1 implements IStrategy {
        @Override
        public void doSomething() {
            System.out.println("具体策略1");
        }
    }

    static class ConcreteStrategy2 implements IStrategy {
        @Override
        public void doSomething() {
            System.out.println("具体策略2");
        }
    }

    static class Context {
        private IStrategy strategy;

        public Context(IStrategy strategy) {
            this.strategy = strategy;
        }

        public void execute() {
            strategy.doSomething();
        }
    }

    public static void main(String[] args) {
        Context context;
        System.out.println("-----执行策略1-----");
        context = new Context(new ConcreteStrategy1());
        context.execute();

        System.out.println("-----执行策略2-----");
        context = new Context(new ConcreteStrategy2());
        context.execute();
    }
}
