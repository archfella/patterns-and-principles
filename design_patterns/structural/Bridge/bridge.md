# Bridge – Usage

The **Bridge** design pattern is used when you want to **separate an abstraction from its implementation**, allowing both to vary independently.
**The Abstraction delegates the work to the Implementation.**
It is especially useful when:

---

## You have multiple dimensions of variation

For example, different _shapes_ (Circle, Square…) and different _rendering methods_ (RasterRenderer, VectorRenderer).  
The Bridge pattern prevents a combinatorial explosion of subclasses.

---

## You want to avoid binding an implementation permanently

The abstraction can switch between implementations at runtime (e.g., switching renderers, platforms, APIs).

---

## You want cleaner, testable, loosely-coupled code

Clients interact only with the abstraction, not the implementation details.  
Implementations can be replaced, extended, or mocked easily.

---

## You want to decouple high-level logic from low-level platform details

Useful in cross-platform applications:

- The abstraction contains business logic
- The implementation contains OS, database, graphics, or device-level operations

---

## Example Structure

```java
// Implementor
interface Renderer {
    void renderCircle(float radius);
}

// Concrete Implementors
class RasterRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle radius " + radius);
    }
}

class VectorRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Drawing lines for a circle radius " + radius);
    }
}

// Abstraction
abstract class Shape {
    protected Renderer renderer;
    public Shape(Renderer renderer) { this.renderer = renderer; }
    public abstract void draw();
}

// Refined Abstraction
class Circle extends Shape {
    private float radius;
    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }
    public void draw() {
        renderer.renderCircle(radius);
    }
}
```
