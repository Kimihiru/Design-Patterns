package behavioral.state;

public class Main {
    public static void main(String[] args){
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        Context context = new Context();

        context.setState(stateA);
        context.request();

        context.setState(stateB);
        context.request();
    }
}