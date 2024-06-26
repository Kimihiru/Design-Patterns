package creational.abstractFactory;

public class Main {
    public static void main(String[] args){
        ConcreteFactoryX factoryX = new ConcreteFactoryX();
        ConcreteFactoryY factoryY = new ConcreteFactoryY();

        ProductA p1 = factoryX.createProductA();
        System.out.println("Product: " + p1.getName());

        ProductA p2 = factoryY.createProductA();
        System.out.println("Product: " + p2.getName());
    }
}