package Decorator.java;

public abstract class Decorator implements Component {
    protected final Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
