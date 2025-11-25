package Decorator.java;

public class ConcreteDecoratorExtendingState extends Decorator {
    public ConcreteDecoratorExtendingState(Component component, State state) {
        super(component);
        this.state = state;
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("State (only x and y): " + state.x + " " + state.y);
    }

    private State state;
}
