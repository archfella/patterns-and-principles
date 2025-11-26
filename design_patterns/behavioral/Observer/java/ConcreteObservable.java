package Observer.java;

public class ConcreteObservable extends Observable {
    public void setState(int newState) {
        this.state = newState;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
