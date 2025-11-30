package coffee;

public class ChocolateCoffeeAddition extends CoffeeAddition {

    public ChocolateCoffeeAddition(Coffee coffee) {
        super(coffee);
    }

    private static final int CHOCOLATE_PRICE = 80;
    @Override
    public int price() {
        return super.price() + CHOCOLATE_PRICE;
    }

    @Override
    public String description() {
        return super.description() + " with Chocolate";
    }
}
