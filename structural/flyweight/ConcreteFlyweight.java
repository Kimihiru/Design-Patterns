package structural.flyweight;

public class ConcreteFlyweight implements Flyweight{
    private int state;

    ConcreteFlyweight(int all_state) {
        this.state = all_state;
    }

    @Override
    public void operation() {
        System.out.println("Concrete Flyweight with state " + this.state);
    }
}