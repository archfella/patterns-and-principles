class SubjectImpl extends Subject{

    private int id;

    public SubjectImpl(int id){
        this.id = id;
    }

    void f1(){
        //Obrada 1...
    }
    
    void f2(){
        //Obrada 2...
    }

    int f3(){
        //Obrada 3...
        return ...;
    }

    int id(){
        return this.id;
    }
}