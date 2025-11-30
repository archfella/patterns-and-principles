class Teleportovanje extends MagicniEfekat{

    private Carobnjak c;
    private Smer s;
    private int pomeraj;

    public Teleportovanje(Carobnjak c){
        this.c = c;
        this.s = ...; //Random smer
        this.pomeraj = ...; //Random pomeraj
    }

    public void aktiviraj(){
        this.c.teleportujSe(this.s, this.pomeraj);
    }

}