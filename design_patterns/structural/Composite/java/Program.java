package Composite.java;

public class Program {
    public static void main(String[] args) {
        // Create leaf components
        Component file1 = new Leaf();
        Component file2 = new Leaf();
        Component file3 = new Leaf();

        // Create composite components (folders)
        Composite folder1 = new Composite();
        Composite folder2 = new Composite();
        Composite rootFolder = new Composite();

        // Build tree structure
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        folder2.addComponent(file3);

        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        // Display structure
        rootFolder.operation();
    }
}
