package creational.AbstractFactory.java;

public class Program {
    public static void main(String[] args) {
        AbstractFactory abstractFactory_Black = new ConcreteFactory_Black();
        ProductB productB_Black = abstractFactory_Black.createProductB();
        productB_Black.use();

        AbstractFactory abstractFactory_White = new ConcreteFactory_White();
        ProductA productA_White = abstractFactory_White.createProductA();
        productA_White.use();
    }
}
