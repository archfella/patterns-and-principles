package Proxy.java;

public class RealSubject implements Subject {
    @Override
    public void request(String payload) {
        System.out.println("RealSubject: handling request with payload: " + payload);
    }
}
