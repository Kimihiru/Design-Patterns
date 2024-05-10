package behavioral.strategy;

public class Main {
    public static void main(String[] args){
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.callStrategy();
    }
}