package creational.Factory.java;

public abstract class Factory {
    public abstract Product factoryMethod();

    public void operation() {
        // ...
        factoryMethod();
        // ...
    };
}
