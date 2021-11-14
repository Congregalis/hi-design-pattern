package creational.factory;

import creational.factory.Product;

public class ConcreteProduct1 implements Product {
    @Override
    public void print() {
        System.out.println("我是商品1号。");
    }
}
