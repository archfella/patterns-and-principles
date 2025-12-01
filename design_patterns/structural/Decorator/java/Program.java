package Decorator.java;

public class Program {
    public static void main(String[] args) {
        // Base component
        Component component = new ConcreteComponent();

        System.out.println("--- Plain component ---");
        component.operation();

        // Add extra functionality via decorator
        Component withFunctionality = new ConcreteDecoratorExtendingFunctionality(component);
        System.out.println("\n--- Component with extra functionality ---");
        withFunctionality.operation();

        // Add state-extending decorator
        State state = new State(1, 2, 3, 'a', 'b', 'c');
        Component withState = new ConcreteDecoratorExtendingState(withFunctionality, state);
        System.out.println("\n--- Component with functionality and state ---");
        withState.operation();

        // Nest another functionality decorator on top of state
        Component nested = new ConcreteDecoratorExtendingFunctionality(withState);
        System.out.println("\n--- Nested decorators (state + extra functionality) ---");
        nested.operation();
    }
}
