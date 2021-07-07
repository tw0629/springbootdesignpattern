package com.tian.designcode.demo1;

/**
 * @author David Tian
 * @desc 抽象工厂
 * @since 2021-01-02 14:39
 */
public class AbstractFactoryDemo {

    interface IProduct1 {
        void show();
    }

    interface IProduct2 {
        void show();
    }

    static class Product1 implements IProduct1 {
        @Override
        public void show() {
            System.out.println("这是1型产品");
        }
    }

    static class Product2 implements IProduct2 {
        @Override
        public void show() {
            System.out.println("这是2型产品");
        }
    }

    interface IFactory {
        IProduct1 createProduct1();

        IProduct2 createProduct2();
    }

    static class Factory implements IFactory {
        @Override
        public IProduct1 createProduct1() {
            return new Product1();
        }

        @Override
        public IProduct2 createProduct2() {
            return new Product2();
        }
    }

    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
