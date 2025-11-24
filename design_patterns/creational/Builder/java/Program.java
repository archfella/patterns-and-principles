package creational.Builder.java;

public class Program {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();

        director.constructFullProduct(builderA);
        builderA.getProduct().show();

        Builder builderB = new ConcreteBuilderB();
        director.constructFullProduct(builderB);
        builderB.getProduct().show();
    }
}
