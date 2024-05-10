package structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Integer, Flyweight> flies = new HashMap();

    Flyweight getFlyweight(int key) {
        if (flies.get(key) != null) {
            return flies.get(key);
        }
        Flyweight fly = new ConcreteFlyweight(key);
        flies.put(key, fly);
        return fly;
    }
}