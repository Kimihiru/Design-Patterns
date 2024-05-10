package behavioral.state;

public class ConcreteStateA implements State{
    @Override
    public void handle() {
        System.out.println("State A handled.");
    }
}