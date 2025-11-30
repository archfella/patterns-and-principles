package commands;

public class PanelState {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PanelState(String text) {
        this.text = text;
    }
}
