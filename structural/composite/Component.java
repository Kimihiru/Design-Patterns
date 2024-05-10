package structural.composite;

public abstract class Component {
    public void add(Component component) {}
    public void remove(int index) {}
    abstract void operation();
}