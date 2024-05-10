package creational.singleton;

public class Singleton {
    private static Singleton instance = null;

    public synchronized static Singleton get() {

        if (Singleton.instance == null) {
            Singleton.instance = new Singleton();
        }

        return Singleton.instance;
    }

    public void tell() {
        System.out.println("This is singleton.");
    }
}