package beverages;

public abstract class BeverageMaker {
    public void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
