package commands;

import java.util.Stack;

public class PanelStateLog {

    private static PanelStateLog instance = null;

    private PanelStateLog() {

    }
    public static PanelStateLog getInstance() {
        if (instance == null) {
            instance = new PanelStateLog();
        }
        return instance;
    }

    private Stack<PanelState> stateLog = new Stack<>();

    public void push(PanelState state) {
        stateLog.push(state);
    }

    public PanelState pop() {
        return stateLog.pop();
    }
}
