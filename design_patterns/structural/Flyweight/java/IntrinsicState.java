package Flyweight.java;

public class IntrinsicState {
    private final String texture;
    private final String color;

    public IntrinsicState(String texture, String color) {
        this.texture = texture;
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public String getColor() {
        return color;
    }
}
