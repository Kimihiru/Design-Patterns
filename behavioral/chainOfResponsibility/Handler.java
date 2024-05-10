package behavioral.chainOfResponsibility;

public abstract class Handler {
    private Handler successor;

    public void setHandler(Handler handler) {
        this.successor = handler;
    }

    public void handleRequest() {
        if (this.successor != null) {
            this.successor.handleRequest();
        }
    }
}