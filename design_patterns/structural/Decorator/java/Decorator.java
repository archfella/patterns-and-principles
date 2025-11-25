package Decorator.java;

public abstract class Decorator {
    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void operation();

    protected Component component;
}
