package behavioral.visitor;

public interface Visitor {
    void visitElementA(ConcreteElementA element);
    void visitElementB(ConcreteElementB element);
}