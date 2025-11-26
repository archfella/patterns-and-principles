package Observer.java;

public class Program {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();
        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        observable.attach(observerA);
        observable.attach(observerB);

        System.out.println("Setting state to 1");
        observable.setState(1);

        System.out.println("Setting state to 2");
        observable.setState(2);

        observable.detach(observerA);
        System.out.println("Detached Observer A, setting state to 3");
        observable.setState(3);
    }
}
