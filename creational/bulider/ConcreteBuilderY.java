package creational.bulider;

public class ConcreteBuilderY extends Builder{
    @Override
    void buildPartA() {
        super.product.makeA("X");
    }

    @Override
    void buildPartB() {
        super.product.makeB("Y");
    }

    @Override
    void buildPartC() {
        super.product.makeC("Z");
    }
}