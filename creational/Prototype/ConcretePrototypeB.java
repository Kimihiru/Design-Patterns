package creational.Prototype;

public class ConcretePrototypeB implements Prototype{
    @Override
    public Prototype clone() {
        return new ConcretePrototypeB();
    }

    @Override
    public String type() {
        return "Tomoyo";
    }
}