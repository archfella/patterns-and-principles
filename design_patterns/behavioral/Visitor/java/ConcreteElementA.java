package Visitor.java;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getDataA() {
        return "Data from Element A";
    }
}
