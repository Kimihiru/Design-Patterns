package structural.adapter;

public class Adapter implements Target{
    private final Adaptee adaptee;

    Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}