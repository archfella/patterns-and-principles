package coffee;

public class BlendCoffee extends Coffee {

    private static final int BLEND_COFFEE_PRICE = 150;
    @Override
    public int price() {
        return BLEND_COFFEE_PRICE;
    }

    @Override
    public String description() {
        return "Blend Coffee";
    }
}
