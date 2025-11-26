package Visitor.java;

public class Program {
    public static void main(String[] args) {
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();

        System.out.println("=== Visitor 1 ===");
        elementA.accept(visitor1);
        elementB.accept(visitor1);

        System.out.println("\n=== Visitor 2 ===");
        elementA.accept(visitor2);
        elementB.accept(visitor2);
    }
}
