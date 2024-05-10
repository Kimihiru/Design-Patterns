package structural.composite;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();
        for (int i = 0; i < 10; i++) {
            composite.add(new Leaf(i));
        }
        composite.operation();
    }
}