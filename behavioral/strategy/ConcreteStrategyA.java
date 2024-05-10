package behavioral.strategy;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("Concrete Strategy A");
    }
}