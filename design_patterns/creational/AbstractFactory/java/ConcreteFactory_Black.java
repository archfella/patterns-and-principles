package creational.AbstractFactory.java;

public class ConcreteFactory_Black implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA_Black();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB_Black();
    }
}
