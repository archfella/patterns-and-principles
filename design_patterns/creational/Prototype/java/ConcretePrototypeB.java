package creational.Product.java;

public class ConcretePrototypeB implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototypeB();
    }
}
