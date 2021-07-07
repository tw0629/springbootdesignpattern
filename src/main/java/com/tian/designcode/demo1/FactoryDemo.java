package com.tian.designcode.demo1;

/**
 * @author David Tian
 * @desc 工厂方法
 * @since 2021-01-02 14:38
 */
public class FactoryDemo {
    interface IProduct {
        public void productMethod();
    }

    static class Product implements IProduct {
        @Override
        public void productMethod() {
            System.out.println("产品");
        }
    }

    interface IFactory {
        IProduct createProduct();
    }

    static class Factory implements IFactory {
        @Override
        public IProduct createProduct() {
            return new Product();
        }
    }

    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct prodect = factory.createProduct();
        prodect.productMethod();
    }
}
