class Proizvod2B extends Proizvod2{

    int B;

    public Proizvod2B clone(){
        Proizvod2B copy = new Proizvod2B();
        copy.B = this.B;
        return copy;
    }

}