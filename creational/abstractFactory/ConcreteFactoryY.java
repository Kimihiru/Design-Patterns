package creational.abstractFactory;

public class ConcreteFactoryY extends AbstractFactory{
    @Override
    ProductA createProductA() {
        return new ConcreteProductAY();
    }

    @Override
    ProductB createProductB() {
        return new ConcreteProductBY();
    }
}