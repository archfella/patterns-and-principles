package Mediator.java;

class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void doC() {
        System.out.println("Colleague2: Doing C");
        if (mediator != null) {
            mediator.notify(this, "C");
        }
    }

    public void doD() {
        System.out.println("Colleague2: Doing D");
        if (mediator != null) {
            mediator.notify(this, "D");
        }
    }
}
