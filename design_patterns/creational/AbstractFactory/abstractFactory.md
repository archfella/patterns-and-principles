# Abstract Factory – Usage

The Abstract Factory pattern provides an interface for creating **families of related objects** without specifying their concrete classes.  
It ensures that products created together are **compatible**, **consistent**, and **interchangeable** as a group.

This pattern is often called the **“factory of factories.”**

---

## When to Use Abstract Factory

### You need to create related objects that must match

Example: A GUI system where all widgets (Button, Checkbox, Window) must follow the same theme (Dark, Light, Modern).

### You want to enforce consistency across product families

Switching factories switches the entire family of components automatically.

### You want to isolate client code from concrete classes

Clients only interact with interfaces — never knowing which concrete classes are used.

### You expect the system to grow with new families

You can add new factories (themes/platforms/products) without touching existing code.
