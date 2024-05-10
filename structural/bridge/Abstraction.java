package structural.bridge;

public abstract class Abstraction {
    protected Implementor implementor;
    Abstraction(Implementor implementor){
        this.implementor=implementor;
    }
    public abstract void operation();
}