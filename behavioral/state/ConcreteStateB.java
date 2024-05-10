package behavioral.state;

public class ConcreteStateB implements State{
    @Override
    public void handle() {
        System.out.println("State B handled.");
    }
}