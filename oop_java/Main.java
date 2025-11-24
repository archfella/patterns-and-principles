/*
    Polymorphic Class in Java:
    ---------------------------
    - Any class can be polymorphic if used via a superclass reference:
*/

class Base {
    void greet() {
        System.out.println("Hello from Base");
    }
}

class Derived extends Base {
    @Override
    void greet() {
        System.out.println("Hello from Derived");
    }
}

public class Main {
    public static void main(String[] args) {
        Base b = new Derived(); // Polymorphism
        b.greet(); // Output: Hello from Derived
    }
}

/*
 * Abstract Class:
 * ----------------
 * - Abstract classes can contain abstract methods and concrete methods:
 */

abstract class Animal {
    abstract void makeSound(); // abstract method

    void sleep() { // concrete method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound(); // Woof!
        a.sleep(); // Sleeping...
    }
}

/*
 * Interface:
 * -----------
 * Interfaces are pure contracts (Java 8+ allows default methods):
 */

interface AnimalInterface {
    void makeSound(); // implicitly public & abstract
}

class Cat implements AnimalInterface {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalInterface a = new Cat();
        a.makeSound(); // Meow!
        a.sleep(); // Sleeping...
    }
}
