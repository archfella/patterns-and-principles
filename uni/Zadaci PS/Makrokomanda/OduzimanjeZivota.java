class OduzimanjeZivota extends MagicniEfekat{

    private Carobnjak c;

    public OduzimanjeZivota(Carobnjak c){
        this.c = c;
    }

    public void aktiviraj(){
        this.c.oduzmiZivot();
    }

}