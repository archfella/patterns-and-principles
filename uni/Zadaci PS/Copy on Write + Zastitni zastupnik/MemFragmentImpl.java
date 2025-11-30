class MemFragmentImpl extends MemFragment{

    private Byte[] data;
    private int rwx;
    
    public MemFragmentImpl(int size, int rwx) {
    	this.data = new Byte[size];
        this.rwx = rwx;
    }

    public Byte read(int address){
        return this.data[address];
    }

    public void write(int address, Byte data){
        this.data[address] = data;
    }

    public void execute(int address){
        //Poziv izvrsavanja instrukcije na datoj adresi
    }

    public MemFragmentImpl clone(){
        MemFragmentImpl copy = new MemFragmentImpl(this.data.length, this.rwx);

        for(int i=0; i < this.data.length; i++){
            copy.data[i] = this.data[i];
        }

        return copy;
    }
}