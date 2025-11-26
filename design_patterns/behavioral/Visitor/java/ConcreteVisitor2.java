package Visitor.java;

public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println(
                "ConcreteVisitor2 processing ElementA differently: " + element.getDataA().length() + " characters");
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("ConcreteVisitor2 processing ElementB differently: " + (element.getDataB() * 2));
    }
}
