class MemFragmentProxy extends MemFragment{

    private MemFragmentImpl impl;
    private int rwx;
    private MemFragmentProxy connection;
    private Boolean shared;

    public Byte read(int address){
        if((rwx & 0b100) != 0){
            return this.impl.read(address);
        }
        else{
            throw new Exception("Reading not permitted!");
        }
    }

    public void write(int address, Byte data){
        if((rwx & 0b010) != 0){
            if(this.shared){
                unbind();
            }
            this.impl.write(address, data);
        }
        else{
            throw new Exception("Writing not permitted!");
        }
    }

    public void execute(int address){
        if((rwx & 0b001) != 0){
            this.impl.execute(address);
        }
        else{
            throw new Exception("Execution not permitted!");
        }
    }

    public MemFragmentProxy clone(){
        MemFragmentProxy child = new MemFragmentProxy(this.rwx);

        child.impl = this.impl;
        this.connection = child;
        child.connection = this;
        this.shared = true;
        child.shared = true;

        return child;
    }

    private MemFragmentProxy(int rwx){
        this.rwx = rwx;
        this.connection = null;
        this.shared = false;
    }

    public MemFragmentProxy(int size, int rwx){
        this(rwx);

        this.impl = new MemFragmentImpl(size, rwx);
    }

    private void unbind(){
        this.shared = false;
        this.connection.connection = null;
        this.connection.shared = false;
        this.connection = null;
        this.impl = this.impl.clone();
    }

}