package coffee;

public class SingleOriginCoffee extends Coffee {

    private static final int SINGLE_ORIGIN_COFFEE_PRICE = 200;
    @Override
    public int price() {
        return SINGLE_ORIGIN_COFFEE_PRICE;
    }

    @Override
    public String description() {
        return "Single Origin Coffee";
    }
}
