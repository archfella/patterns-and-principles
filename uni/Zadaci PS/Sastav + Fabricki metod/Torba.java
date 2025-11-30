class Torba extends Stvar{
    private ArrayList<Stvar> stvari;

    public Torba(){
        this.stvari = new ArrayList<>();
    }
    public int snaga(){
        int snaga = 0;
        for(Stvar s: stvari) snaga += s.snaga();
        return snaga;
    }

    public int vrednost(){
        int vrednost = 0;
        for(Stvar s: stvari) snaga += s.vrednost();
        return vrednost;
    }

    public void dodajStvar(Stvar s){
        this.stvari.add(s);
    }

}