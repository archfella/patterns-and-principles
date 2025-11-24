package creational.Product.java;

public class ConcretePrototypeA implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototypeA();
    }
}
