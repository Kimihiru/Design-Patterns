package behavioral.visitor;

public class ConcreteVisitorA implements Visitor{
    @Override
    public void visitElementA(ConcreteElementA element) {
        System.out.println("Concrete Visitor A: Element A visited.");
    }

    @Override
    public void visitElementB(ConcreteElementB element) {
        System.out.println("Concrete Visitor A: Element B visited.");
    }
}