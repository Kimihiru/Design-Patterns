package creational.bulider;

public class ConcreteBuilderX extends Builder{
    @Override
    void buildPartA() {
        super.product.makeA("Sakura");
    }

    @Override
    void buildPartB() {
        super.product.makeB("Tomoyo");
    }

    @Override
    void buildPartC() {
        super.product.makeC("Miku");
    }
}