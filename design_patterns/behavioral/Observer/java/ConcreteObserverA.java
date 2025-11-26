package Observer.java;

public class ConcreteObserverA implements Observer {
    @Override
    public void update(Observable source, int state) {
        System.out.println("Observer A notified. New state = " + state);
    }
}
