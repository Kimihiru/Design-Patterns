package behavioral.command;

public class Invoker {
    private Command command;

    public void set(Command command) {
        this.command = command;
    }

    public void confirm() {
        if (this.command != null) {
            this.command.execute();
        }
    }
}