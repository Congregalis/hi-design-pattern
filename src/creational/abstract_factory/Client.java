package creational.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ConcreteFactory2 factory2 = new ConcreteFactory2();

        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();

        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();

        productA1.print();
        productA2.print();
        productB1.print();
        productB2.print();
    }
}
