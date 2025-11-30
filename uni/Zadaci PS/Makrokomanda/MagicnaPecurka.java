class MagicnaPecurka{

    private MagicniEfekat efekat;
    private Coordinate xy;

    public MagicnaPecurka(Coordinate xy){
        this.xy = xy;
        this.efekat = ... //Random pravljenje efekta
    }

    public interaguj(Carobnjak c){
        this.efekat.aktiviraj();
    }

}