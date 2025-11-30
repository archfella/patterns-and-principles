abstract class MemFragment{

    public abstract Byte read(int address);

    public abstract void write(int address, Byte data);

    public abstract void execute(int address);

    public abstract MemFragment clone();

}