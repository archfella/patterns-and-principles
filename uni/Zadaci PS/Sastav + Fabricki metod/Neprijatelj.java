abstract class Neprijatelj{
    protected int snaga;

    public Neprijatelj(int snaga){
        this.snaga = snaga;
    }

    public void interaguj(Junak j){
        if(j.dohvatiSnagu() > this.snaga){
            Stvar nagrada = napraviNagradu();
            j.dodajNagradu(nagrada);
        }
    }

    abstract public Stvar napraviNagradu();
}