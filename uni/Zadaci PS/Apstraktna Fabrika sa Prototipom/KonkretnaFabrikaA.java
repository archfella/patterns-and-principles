class KonkretnaFabrikaA extends ApstraktnaFabrika{

    public KonkretnaFabrikaA(Proizvod1A proizvod1, Proizvod2A proizvod2) {
        super(proizvod1, proizvod2);
    }

    public Proizvod1 napraviProizvod1(){
        return this.proizvod1.clone();
    }

    public Proizvod2 napraviProizvod2(){
        return this.proizvod2.clone();
    }

}