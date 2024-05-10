package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        factory.getFlyweight(1).operation();
        factory.getFlyweight(2).operation();
    }
}