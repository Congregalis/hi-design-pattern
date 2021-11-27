package behavioral.template_method;

public class Client {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();

        concreteClass.templateMethod();
    }
}
