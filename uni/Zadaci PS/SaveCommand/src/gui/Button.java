package gui;

import commands.Command;

public class Button {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    // ...
}
