package Mediator.java;

public class Program {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(c1);
        mediator.setColleague2(c2);

        System.out.println("Client triggers operation A:");
        c1.doA();

        System.out.println();
        System.out.println("Client triggers operation D:");
        c2.doD();
    }
}
