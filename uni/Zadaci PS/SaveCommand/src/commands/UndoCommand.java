package commands;

import gui.Panel;

public class UndoCommand extends Command {

    private Panel panel = Panel.getInstance();

    @Override
    public void execute() {
        panel.setText(PanelStateLog.getInstance().pop().getText());
    }

}
