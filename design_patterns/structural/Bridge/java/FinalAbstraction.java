package Bridge.java;

public class FinalAbstraction extends Abstraction {
    public FinalAbstraction(Implementation implementation) {
        super(implementation);
    }

    public void operation() {
        System.out.println("Preprocessing...");
        implementation.operationImplementation();
        System.out.println("Postprocessing...");
    }

}