package creational.Product.java;

public class Program {
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototypeA();
        Prototype prototype2 = prototype1.clone();
        prototype1 = prototype2.clone();
    }
}
