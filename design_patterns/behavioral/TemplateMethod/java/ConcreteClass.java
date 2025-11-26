package TemplateMethod.java;

public class ConcreteClass extends AbstractClass {
    @Override
    public void primitiveOperationA() {
        System.out.println("ConcreteClass: Operation A");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("ConcreteClass: Operation B");
    }
}
