package Proxy.java;

public class Program {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        proxy.setAccess(false);
        proxy.request("First call");

        proxy.setAccess(true);
        proxy.request("Second call");
    }
}
