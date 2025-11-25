package Flyweight.java;

public class ExtrinsicState {
    private final int x;
    private final int y;

    public ExtrinsicState(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
