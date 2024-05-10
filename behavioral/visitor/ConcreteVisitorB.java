package behavioral.visitor;

public class ConcreteVisitorB implements Visitor{
    @Override
    public void visitElementA(ConcreteElementA element) {
        System.out.println("Concrete Visitor B: Element A visited.");
    }

    @Override
    public void visitElementB(ConcreteElementB element) {
        System.out.println("Concrete Visitor B: Element B visited.");
    }
}