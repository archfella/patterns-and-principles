package Decorator.java;

public class ConcreteDecoratorExtendingFunctionality extends Decorator {
    public ConcreteDecoratorExtendingFunctionality(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        addedOperation();
    }

    private void addedOperation() {
        System.out.println("Decorator adds functionality!");
    }
}
