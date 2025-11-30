class Carolija extends MagicniEfekat{

    private ArrayList<MagicniEfekat> efekti;

    public Carolija(){
        this.efekti = new ArrayList<>();
    }

    public void aktiviraj(){
        for(MagicniEfekat m: efekti){
            m.aktiviraj();
        }
    }

    public void dodajEfekat(MagicniEfekat m){
        this.efekti.add(m);
    }

    public void izbaciEfekat(MagicniEfekat m){
        this.efekti.remove(m);
    }

}