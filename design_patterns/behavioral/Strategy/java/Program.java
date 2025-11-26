package Strategy.java;

public class Program {
    public static void main(String[] args) {
        Context context = new Context();

        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.doWork();

        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.doWork();

        ConcreteStrategyC strategyC = new ConcreteStrategyC();
        context.setStrategy(strategyC);
        context.doWork();
    }
}
