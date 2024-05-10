package behavioral.visitor;

public class Main {
    public static void main(String[] args){
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        Visitor visitor1 = new ConcreteVisitorA();
        Visitor visitor2 = new ConcreteVisitorB();

        elementA.accept(visitor1);
        elementA.accept(visitor2);

        elementB.accept(visitor1);
        elementB.accept(visitor2);
    }
}