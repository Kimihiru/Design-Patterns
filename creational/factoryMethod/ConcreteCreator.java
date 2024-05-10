package creational.factoryMethod;

public class ConcreteCreator implements Creator{
    @Override
    public Product createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public Product createProductB() {
        return new ConcreteProductB();
    }
}