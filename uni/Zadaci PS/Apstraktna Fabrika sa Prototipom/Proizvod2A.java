class Proizvod2A extends Proizvod2{

    int A;

    public Proizvod2A clone(){
        Proizvod2A copy = new Proizvod2A();
        copy.A = this.A;
        return copy;
    }

}