package behavioral.observer;

public class ConcreteSubject extends Subject{
    private int subjectState;
    @Override
    public int getState() {
        return this.subjectState;
    }

    @Override
    public void setState(int state) {
        this.subjectState = state;
    }
}