package creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype;

        prototype = Client.make(0);
        System.out.println("Prototype " + prototype.type());

        prototype = Client.make(1);
        System.out.println("Prototype " + prototype.type());
    }
}