package behavioral.mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected int id;

    public Colleague(Mediator mediator, int i) {
        this.mediator = mediator;
        this.id = i;
    }

    public int getID() {
        return this.id;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}