package Mediator.java;

class ConcreteMediator implements Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void notify(Colleague sender, String event) {
        if ("A".equals(event)) {
            System.out.println("Mediator reacts to A and triggers:");
            if (colleague2 != null) {
                colleague2.doC();
            }
        } else if ("D".equals(event)) {
            System.out.println("Mediator reacts to D and triggers:");
            if (colleague1 != null) {
                colleague1.doB();
            }
        }
    }
}
