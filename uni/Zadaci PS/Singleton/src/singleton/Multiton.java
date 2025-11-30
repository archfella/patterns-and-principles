package singleton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    private static Map<String, Multiton> instances = new HashMap<>();
    private String name;

    private Multiton(String name) {
        this.name = name;
    }

    public static Multiton getInstance(String name) {
        if (!instances.containsKey(name)) {
            instances.put(name, new Multiton(name));
        }
        return instances.get(name);
    }


}
