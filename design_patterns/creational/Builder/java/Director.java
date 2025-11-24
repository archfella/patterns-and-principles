package creational.Builder.java;

public class Director {
    public void constructFullProduct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

    public void constructSimpleProduct(Builder builder) {
        builder.buildPartA();
    }
}
