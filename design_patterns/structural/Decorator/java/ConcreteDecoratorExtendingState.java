package Decorator.java;

public class ConcreteDecoratorExtendingState extends Decorator {
    private final State state;

    public ConcreteDecoratorExtendingState(Component component, State state) {
        super(component);
        this.state = state;
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("State (only x and y): " + state.x + " " + state.y);
    }
}
