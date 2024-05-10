package creational.Prototype;

public class ConcretePrototypeA implements Prototype{
    @Override
    public Prototype clone() {
        return new ConcretePrototypeA();
    }

    @Override
    public String type() {
        return "Sakura";
    }
}