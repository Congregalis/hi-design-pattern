package creational.abstract_factory;

public abstract class AbstractProductA {
    String belongTo;

    public void print() {
        System.out.println("This is ProductA, made by " + belongTo + ".");
    }
}
