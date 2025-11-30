package commands;

import gui.Panel;

public class SaveCommand extends Command {

    private Panel panel = Panel.getInstance();

    @Override
    public void execute() {
        String savedText = panel.getText();
        PanelStateLog.getInstance().push(new PanelState(savedText));
    }
    
}
