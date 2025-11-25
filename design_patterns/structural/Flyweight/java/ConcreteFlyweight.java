package Flyweight.java;

public class ConcreteFlyweight implements IFlyweight {

    private final IntrinsicState intrinsic;

    public ConcreteFlyweight(String texture, String color) {
        this.intrinsic = new IntrinsicState(texture, color);
    }

    @Override
    public void operation(ExtrinsicState extrinsic) {
        render(extrinsic, intrinsic);
    }

    private void render(ExtrinsicState extrinsic, IntrinsicState intrinsic) {
        System.out.printf(
                "Rendering object at (%d, %d) with texture '%s' and color '%s'%n",
                extrinsic.getX(), extrinsic.getY(), intrinsic.getTexture(), intrinsic.getColor());
    }
}
