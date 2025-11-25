# Decorator – Usage

The **Decorator** design pattern allows you to **dynamically add behavior** to objects **without modifying their class**.  
It is especially useful when you want to add **responsibilities at runtime** in a flexible and reusable way.

---

## When to Use Decorator

### 1. You want to add behavior without subclassing

- Instead of creating multiple subclasses for every combination of features, decorators can wrap an object and add features on demand.

### 2. You want to extend functionality dynamically

- Features can be stacked: wrap an object with multiple decorators to combine behaviors.

### 3. You want to follow the Open/Closed Principle

- Classes remain closed for modification, open for extension.
- New behavior is added by creating a new decorator class, not by changing existing code.
