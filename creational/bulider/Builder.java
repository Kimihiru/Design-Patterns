package creational.bulider;

public abstract class Builder {
    protected Product product;

    Builder() {
        product = new Product();
    }

    public Product get() {
        return this.product;
    }

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();
}