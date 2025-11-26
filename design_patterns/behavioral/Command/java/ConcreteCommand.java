package Command.java;

public class ConcreteCommand implements Command {
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    private Receiver receiver;
}
