package coffee;

public class SugarCoffeeAddition extends CoffeeAddition {

    public SugarCoffeeAddition(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int price() {
        return super.price();
    }

    @Override
    public String description() {
        return super.description() + " with Sugar";
    }
}
