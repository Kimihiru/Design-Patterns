package behavioral.chainOfResponsibility;

public class ConcreteHandlerB extends Handler{
    public Boolean canHandle(){
        return true;
    }
    @Override
    public void handleRequest() {
        if (this.canHandle()) {
            System.out.println("Handled by Concrete Handler B");
        }
        else {
            System.out.println("Cannot be handled by Handler B");
            super.handleRequest();
        }
    }
}