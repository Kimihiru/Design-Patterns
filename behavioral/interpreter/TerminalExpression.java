package behavioral.interpreter;

public class TerminalExpression extends AbstractExpression{
    private final String value;

    public TerminalExpression(String val) {
        this.value = val;
    }

    @Override
    public Boolean interpret(Context context) {
        return context.get(this.value);
    }
}