package creational.bulider;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.set(new ConcreteBuilderX());
        director.construct();

        Product p1 = director.get();
        System.out.println("1st product parts: " + p1.get());

        director.set(new ConcreteBuilderY());
        director.construct();

        Product p2 = director.get();
        System.out.println("2nd product parts: " + p2.get());
    }
}