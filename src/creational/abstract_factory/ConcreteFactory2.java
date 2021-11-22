package creational.abstract_factory;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2("ConcreteFactory2");
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2("ConcreteFactory2");
    }
}
