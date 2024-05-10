package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Boolean> map = new HashMap<>();

    public void set(String var, Boolean value) {
        this.map.put(var, value);
    }

    public Boolean get(String exp) {
        return this.map.get(exp);
    }
}