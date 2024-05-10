package structural.decorator;

public abstract class Decorator implements Component{
    protected Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}