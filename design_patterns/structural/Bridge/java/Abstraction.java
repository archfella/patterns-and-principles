package Bridge.java;

public class Abstraction {
    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void operation() {
        implementation.operationImplementation();
    }

    protected Implementation implementation;
}