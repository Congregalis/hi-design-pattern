package creational.abstract_factory;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1("ConcreteFactory1");
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1("ConcreteFactory1");
    }
}
