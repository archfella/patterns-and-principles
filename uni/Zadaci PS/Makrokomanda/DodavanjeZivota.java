class DodavanjeZivota extends MagicniEfekat{

    private Carobnjak c;

    public DodavanjeZivota(Carobnjak c){
        this.c = c;
    }

    public void aktiviraj(){
        this.c.dodajZivot();
    }

}