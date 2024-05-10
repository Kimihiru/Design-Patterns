package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(
                new ConcreteDecoratorB(new ConcreteComponent()));
        component.operation();
    }
}