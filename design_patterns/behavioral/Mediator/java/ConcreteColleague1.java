package Mediator.java;

class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void doA() {
        System.out.println("Colleague1: Doing A");
        if (mediator != null) {
            mediator.notify(this, "A");
        }
    }

    public void doB() {
        System.out.println("Colleague1: Doing B");
        if (mediator != null) {
            mediator.notify(this, "B");
        }
    }
}
