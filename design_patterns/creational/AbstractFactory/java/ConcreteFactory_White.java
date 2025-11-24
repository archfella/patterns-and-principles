package creational.AbstractFactory.java;

public class ConcreteFactory_White implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA_White();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB_White();
    }
}
