# Flyweight – Usage

The **Flyweight** design pattern is used to **minimize memory usage** by sharing as much data as possible between similar objects.  
It is especially useful when dealing with **a large number of fine-grained objects**.

---

## Key Concepts

### **Intrinsic state**

- Shared among multiple flyweight objects.
- Stored **inside the flyweight**.
- Example: the **glyph shape** of a character, or the **texture** of a tree in a game.

### **Extrinsic state**

- Not shared; varies per usage.
- Supplied **externally** by the client at runtime.
- Example: the **position** of a tree on the map, or the **location** of a character in a document.

---

## When to Use Flyweight

1. You need to create **many similar objects** and want to reduce memory usage.
2. Part of the object’s state can be **shared** (intrinsic), while the rest is **context-specific** (extrinsic).
3. You want to **centralize shared data** and allow **runtime customization** via extrinsic state.

---
