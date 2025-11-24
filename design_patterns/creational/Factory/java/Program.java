package creational.Factory.java;

public class Program {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Product product = concreteFactory.factoryMethod();
        product.use();
    }
}
