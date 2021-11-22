package creational.abstract_factory;

public abstract class AbstractProductB {
    String belongTo;

    public void print() {
        System.out.println("This is ProductB, made by " + belongTo + ".");
    }
}
