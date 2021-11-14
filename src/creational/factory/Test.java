package creational.factory;

public class Test {


    public static void main(String[] args) {
        Factory factory1 = new ConcreteFactory1();
        Factory factory2 = new ConcreteFactory2();

        Product product1 = factory1.createProduct();
        Product product2 = factory2.createProduct();

        product1.print();
        product2.print();
    }
}
