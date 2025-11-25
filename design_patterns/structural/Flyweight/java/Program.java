package Flyweight.java;

public class Program {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        ExtrinsicState state1 = new ExtrinsicState(10, 20);
        ExtrinsicState state2 = new ExtrinsicState(50, 80);

        ConcreteFlyweight tree1 = factory.getFlyweight("Oak", "Green");
        ConcreteFlyweight tree2 = factory.getFlyweight("Oak", "Green");

        tree1.operation(state1);
        tree2.operation(state2);

        System.out.println("Flyweights created: " + factory.getFlyweightCount());
    }
}
