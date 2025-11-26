package Visitor.java;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getDataB() {
        return 42;
    }
}
