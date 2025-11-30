import coffee.*;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new ChocolateCoffeeAddition(new MilkCoffeeAddition(new SugarCoffeeAddition(new BlendCoffee())));
        System.out.println("Coffee price is: " + coffee.price());
        System.out.println("You are currently drinking: " + coffee.description());

    }
}