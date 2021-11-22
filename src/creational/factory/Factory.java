package creational.factory;

public abstract class Factory {

    public abstract Product createProduct();

    public void sell(Product product) {
        System.out.println(product.getClass().getName() + " is sold.");
    }
}
