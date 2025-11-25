package Memento.java;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: state changed to \"" + state + "\"");
    }

    public String getState() {
        return state;
    }

    public Memento saveToMemento() {
        System.out.println("Originator: saving state to Memento.");
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("Originator: state restored to \"" + state + "\"");
    }
}
