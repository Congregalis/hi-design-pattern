package behavioral.template_method;

public abstract class AbstractClass {
    void templateMethod() {
        // step 1
        primitiveMethodA();
        // step 2
        primitiveMethodB();
        // step 3
        finalStep();

    }

    abstract void primitiveMethodA();

    abstract void primitiveMethodB();

    void finalStep() {
        System.out.println("final Step: 通用的步骤可以由抽象类来实现。");
    };
}
