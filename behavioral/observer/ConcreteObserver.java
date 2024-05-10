package behavioral.observer;

public class ConcreteObserver implements Observer{
    private int observerState;
    public ConcreteObserver(int state) {
        this.observerState = state;
    }
    @Override
    public int getState() {
        return this.observerState;
    }

    @Override
    public void update(Subject subject) {
        this.observerState = subject.getState();
        System.out.println("Observer state updated.");
    }
}