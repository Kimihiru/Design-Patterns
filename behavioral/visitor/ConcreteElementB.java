package behavioral.visitor;

public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }
}