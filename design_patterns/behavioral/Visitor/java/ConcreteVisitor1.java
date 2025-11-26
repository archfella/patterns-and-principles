package Visitor.java;

public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("ConcreteVisitor1 visiting ElementA: " + element.getDataA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("ConcreteVisitor1 visiting ElementB: " + element.getDataB());
    }
}
