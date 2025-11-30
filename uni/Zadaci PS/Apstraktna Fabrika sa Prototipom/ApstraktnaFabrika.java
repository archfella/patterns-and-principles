abstract class ApstraktnaFabrika{

    protected Proizvod1 proizvod1;
    protected Proizvod2 proizvod2;

    public ApstraktnaFabrika(Proizvod1 proizvod1, Proizvod2 proizvod2) {
        this.proizvod1 = proizvod1;
        this.proizvod2 = proizvod2;
    }

    abstract public Proizvod1 napraviProizvod1();

    abstract public Proizvod2 napraviProizvod2();

}