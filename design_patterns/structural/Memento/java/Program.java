package Memento.java;

public class Program {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveToMemento());

        originator.setState("State #4");

        originator.restoreFromMemento(careTaker.get(0));
        originator.restoreFromMemento(careTaker.get(1));
    }
}
