package creational.Singleton.java;

public class Singleton {

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    protected Singleton() {
    }

    public void operation() {
    }

    private static Singleton instance;

}
