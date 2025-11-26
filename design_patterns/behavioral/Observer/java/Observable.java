package Observer.java;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    protected int state = 0;
    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this, state);
        }
    }
}
