package behavioral.interpreter;

public class NonterminalExpression extends AbstractExpression{
    private final AbstractExpression lop;
    private final AbstractExpression rop;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.lop = left;
        this.rop = right;
    }

    @Override
    public Boolean interpret(Context context) {
        return this.lop.interpret(context) && this.rop.interpret(context);
    }
}
