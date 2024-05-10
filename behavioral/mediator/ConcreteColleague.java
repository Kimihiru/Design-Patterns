package behavioral.mediator;

public class ConcreteColleague extends Colleague{
    public ConcreteColleague(Mediator mediator, int i) {
        super(mediator, i);
    }

    @Override
    public void send(String msg) {
        System.out.println("Message " + msg + " sent by Colleague " + this.id);
        this.mediator.distribute(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Message " + msg + " received by Colleague " + this.id);
    }
}