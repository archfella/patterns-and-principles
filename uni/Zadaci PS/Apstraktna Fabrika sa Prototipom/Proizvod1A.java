class Proizvod1A extends Proizvod1{

    int A;

    public Proizvod1A clone(){
        Proizvod1A copy = new Proizvod1A();
        copy.A = this.A;
        return copy;
    }

}