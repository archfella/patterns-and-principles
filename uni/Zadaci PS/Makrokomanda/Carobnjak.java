class Carobnjak{

    private int zivoti;
    private Coordinate xy;

    public void pomeriSe(Smer s){
        this.xy.move(s);
    }

    public void teleportujSe(Smer s, int pomeraj){
        for(int i=0; i < pomeraj; i++) this.xy.move(s);
    }

    public void dodajZivot(){
        this.zivoti++;
    }

    public void oduzmiZivot(){
        this.zivoti--;
    }

}