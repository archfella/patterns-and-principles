package Command.java;

public class Invoker {
    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null)
            command.execute();
    }

    private Command command;
}
