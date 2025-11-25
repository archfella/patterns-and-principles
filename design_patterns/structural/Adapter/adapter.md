# Adapter – Usage

The Adapter pattern allows **incompatible interfaces** to work together.  
It acts as a **translator** between a client expecting a `Target` interface and an existing class (`Adaptee`) that has a different interface.

The Adapter pattern is commonly used when you want to **reuse existing code** without modifying it.

---

## When to Use Adapter

### You want to integrate a class with an incompatible interface

The client expects methods that the existing class does not provide.

### You want to reuse legacy or third-party code

Instead of modifying the original code, create an adapter to match the expected interface.

### You want to decouple client code from the implementation

Clients depend only on the `Target` interface, not on the concrete adaptee class - we can change the underlying implementation (replace **Adaptee** with another class).
