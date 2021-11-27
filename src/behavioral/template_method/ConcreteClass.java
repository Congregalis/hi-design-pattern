package behavioral.template_method;

public class ConcreteClass extends AbstractClass {
    @Override
    void primitiveMethodA() {
        System.out.println("Step 1: 由具体子类实现。");
    }

    @Override
    void primitiveMethodB() {
        System.out.println("Step 2: 由具体子类实现。");
    }

}
