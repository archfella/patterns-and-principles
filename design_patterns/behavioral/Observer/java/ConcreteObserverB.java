package Observer.java;

public class ConcreteObserverB implements Observer {
    @Override
    public void update(Observable source, int state) {
        System.out.println("Observer B notified. New state = " + state);
    }
}
