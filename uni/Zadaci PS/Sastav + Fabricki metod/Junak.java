class Junak{

    private ArrayList<Stvar> inventar;

    private int snaga;

    private int novcici;

    public Junak(int snaga){
        this.snaga = snaga;
        this.novcici = 0;
    }

    public int snaga(){
        int konacnaSnaga = this.snaga;
        for(Stvar s: inventar) konacnaSnaga += snaga();
        return konacnaSnaga;
    }

    public void prodaj(int index){
        Stvar s = inventar.pop(index);
        this.novcici += s.vrednost();
    }

    public void dodajNagradu(Stvar s){
        this.inventar.add(s);
    }

}