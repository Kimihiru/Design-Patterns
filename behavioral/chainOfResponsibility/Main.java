package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setHandler(handlerB);
        handlerA.handleRequest();
    }
}