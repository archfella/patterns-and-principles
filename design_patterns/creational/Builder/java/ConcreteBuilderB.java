package creational.Builder.java;

public class ConcreteBuilderB implements Builder {
    public ConcreteBuilderB() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.attrib_1 = 2;
    }

    @Override
    public void buildPartB() {
        product.attrib_2 = 'B';
    }

    @Override
    public void buildPartC() {
        product.attrib_3 = 20.25;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    private Product product;
}
