public class Adapter extends Target {
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetOperation() {
        adaptee.adapteeOperation();
    }

    private Adaptee adaptee;
}
