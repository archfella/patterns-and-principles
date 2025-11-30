package coffee;

public class MilkCoffeeAddition extends CoffeeAddition {

    private static final int MILK_PRICE = 100;

    public MilkCoffeeAddition(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int price() {
        return super.price() + MILK_PRICE;
    }

    @Override
    public String description() {
        return super.description() + " with Milk";
    }
}
