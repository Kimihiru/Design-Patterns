package behavioral.visitor;

public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }
}