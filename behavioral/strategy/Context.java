package behavioral.strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void callStrategy() {
        this.strategy.algorithm();
    }
}