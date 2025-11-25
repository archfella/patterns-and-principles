package Proxy.java;

public class Proxy implements Subject {

    private RealSubject realSubject;
    private boolean accessGranted;

    public void setAccess(boolean granted) {
        this.accessGranted = granted;
    }

    @Override
    public void request(String payload) {
        if (!checkAccess()) {
            System.out.println("Proxy: access denied. Cannot forward request.");
            return;
        }

        if (realSubject == null) {
            System.out.println("Proxy: creating RealSubject on demand.");
            realSubject = new RealSubject();
        }

        logAccess(payload);
        realSubject.request(payload);
    }

    private boolean checkAccess() {
        System.out.println("Proxy: checking access...");
        return accessGranted;
    }

    private void logAccess(String payload) {
        System.out.println("Proxy: logging access for payload: " + payload);
    }
}
