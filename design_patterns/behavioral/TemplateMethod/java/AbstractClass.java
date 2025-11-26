package TemplateMethod.java;

public abstract class AbstractClass {
    public void templateMethod() {
        primitiveOperationA();
        primitiveOperationB();
    }

    public abstract void primitiveOperationA();

    public abstract void primitiveOperationB();
}
