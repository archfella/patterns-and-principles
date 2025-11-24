package creational.Builder.java;

public class ConcreteBuilderA implements Builder {

    public ConcreteBuilderA() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.attrib_1 = 1;
    }

    @Override
    public void buildPartB() {
        product.attrib_2 = 'A';
    }

    @Override
    public void buildPartC() {
        product.attrib_3 = 10.15;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    private Product product;
}
