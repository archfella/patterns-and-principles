# Composite – Usage

The **Composite** design pattern is used when you need to represent **hierarchical, tree-like structures** of objects, where **individual items (leaves)** and **groups of items (composites)** should be treated **uniformly**.

---

## When to Use Composite

### **1. You want to represent part–whole hierarchies**

Anything that forms a tree structure is a good candidate:

- Files and folders
- UI components and containers
- Game objects and groups
- Organization charts
- DOM trees

---

### **2. You want clients to treat individual objects and groups the same**

Clients shouldn’t need to check:

```java
if (obj is leaf) { ... } else { ... }
```
