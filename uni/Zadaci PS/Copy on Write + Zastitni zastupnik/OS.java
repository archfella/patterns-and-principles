
public class OS {
	
	//...
	
	Process createProcess() {
		
		Process p = new Process();
		
		//...
		
		p.code = new MemFragmentProxy(codeSize, 0b001);
		p.data = new MemFragmentProxy(dataSize, 0b110);
		p.stack = new MemFragmentProxy(stackSize, 0b110);
		
		//...
		
		return p;
	}
	
	//...

}
