# Builder – Usage

The Builder pattern separates **the construction of a complex object** from its **final representation**, allowing the same construction process to create different variations of an object by _passing in different parameters_ or by _slightly altering construction steps_.

It is especially useful when objects require **multiple steps**, **optional parameters**, or **must be created in a specific order**.

---

## When to Use Builder

### Object construction is complex

The object has many fields, nested components, or requires multi-step initialization.

### You want to avoid telescoping constructors

Instead of:

```cpp
House h(4, true, false, true, 3, false, true); // unreadable
```
