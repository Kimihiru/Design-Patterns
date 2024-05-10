package creational.abstractFactory;

public class ConcreteFactoryX extends AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductAX();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductBX();
    }
}