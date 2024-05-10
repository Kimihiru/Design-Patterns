package structural.proxy;

public class Proxy implements Subject{
    private final RealSubject realSubject=new RealSubject();
    @Override
    public void request() {
        this.realSubject.request();
    }
}