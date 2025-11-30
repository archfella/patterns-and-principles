class Process{

    private MemFragment code;
    private MemFragment stack;
    private MemFragment data;

    //...

    public int fork(){
        Process child = new Process();
        
        //...
        child.code = code.clone();
        child.stack = stack.clone();
        child.data = data.clone();
        //...
        
    }

    //...

}