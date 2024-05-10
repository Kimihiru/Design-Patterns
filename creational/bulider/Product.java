package creational.bulider;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void makeA(String part) {
        this.partA = part;
    }

    public void makeB(String part) {
        this.partB = part;
    }

    public void makeC(String part) {
        this.partC = part;
    }

    public String get() {
        return (partA + " " + partB + " " + partC);
    }
}