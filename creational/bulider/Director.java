package creational.bulider;

public class Director {
    public Builder builder;
    public Product get() {
        return this.builder.get();
    }
    public void set(Builder b) {
        this.builder = b;
    }
    public void construct() {
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
    }
}