package behavioral.templateMethod;

public class Main {
    public static void main(String[] args){
        AbstractClass tm = new ConcreteClass();
        tm.templateMethod();
    }
}