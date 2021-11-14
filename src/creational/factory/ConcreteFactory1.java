package creational.factory;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
