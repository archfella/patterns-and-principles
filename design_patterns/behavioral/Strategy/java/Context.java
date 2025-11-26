package Strategy.java;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doWork() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("No strategy set");
        }
    }
}
