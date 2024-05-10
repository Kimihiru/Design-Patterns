package creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<Prototype> types;

    static {
        Client.types = new ArrayList<Prototype>() {
            {
                add(new ConcretePrototypeA());
                add(new ConcretePrototypeB());
            }
        };
    }

    public static Prototype make(int index) {
        return Client.types.get(index).clone();
    }
}