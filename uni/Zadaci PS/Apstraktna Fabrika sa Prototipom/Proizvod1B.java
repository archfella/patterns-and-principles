class Proizvod1B extends Proizvod1{

    int B;

    public Proizvod1B clone(){
        Proizvod1B copy = new Proizvod1B();
        copy.B = this.B;
        return copy;
    }

}