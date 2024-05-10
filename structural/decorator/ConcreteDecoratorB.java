package structural.decorator;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    @Override
    public void operation() {
        super.operation();
        System.out.println("Decorator B");
    }
}