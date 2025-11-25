package Flyweight.java;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private final Map<String, ConcreteFlyweight> flyweights = new HashMap<>();

    private String getKey(String texture, String color) {
        return texture + "_" + color;
    }

    public ConcreteFlyweight getFlyweight(String texture, String color) {
        String key = getKey(texture, color);

        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(texture, color));
        }

        return flyweights.get(key);
    }

    public int getFlyweightCount() {
        return flyweights.size();
    }
}
