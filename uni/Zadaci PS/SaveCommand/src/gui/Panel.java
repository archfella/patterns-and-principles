package gui;

public class Panel {

    private String text;
    private static Panel instance = null;
    public static Panel getInstance() {
        if (instance == null) {
            instance = new Panel();
        }
        return instance;
    }
    private Panel() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
