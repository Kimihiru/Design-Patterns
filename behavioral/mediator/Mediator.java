package behavioral.mediator;

public interface Mediator {
    void add(Colleague colleague);
    void distribute(Colleague sender, String msg);
}