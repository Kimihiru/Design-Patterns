package behavioral.chainOfResponsibility;

public class ConcreteHandlerA extends Handler{
    public Boolean canHandle(){
        return false;
    }
    @Override
    public void handleRequest() {
        if (this.canHandle()) {
            System.out.println("Handled by Concrete Handler A");
        }
        else {
            System.out.println("Cannot be handled by Handler A");
            super.handleRequest();
        }
    }
}