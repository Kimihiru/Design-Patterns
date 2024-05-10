package structural.flyweight;

public class UnsharedConcreteFlyweight implements Flyweight{
    private int state;

    UnsharedConcreteFlyweight(int intrinsic_state) {
        this.state = intrinsic_state;
    }

    @Override
    public void operation() {
        System.out.println("Unshared Flyweight with state " + this.state);
    }
}