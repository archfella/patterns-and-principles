package coffee;

public abstract class CoffeeAddition extends Coffee {
    private Coffee coffee;

    public CoffeeAddition(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int price() {
        return coffee.price();
    }

    @Override
    public String description() {
        return coffee.description();
    }
}
