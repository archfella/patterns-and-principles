# Visitor – Usage

The **Visitor** pattern allows you to separate an operation from the object structure  
on which it operates. It lets you add new behaviors _without modifying_ the element classes  
by introducing a new "visitor" class for each behavior.

It is especially useful when you have a complex object structure and want to apply  
different operations to its elements over time.

---

## When to Use the Visitor Pattern

### 1. You need to add new operations frequently

Instead of changing existing classes, you simply create a new Visitor.

### 2. You work with a **stable object structure**

The elements do not change often, but their behaviors might.

Examples:

- AST nodes in compilers
- XML/JSON processing
- File systems (files & folders)
- Scene graphs in rendering systems

### 3. You want to follow the **Open/Closed Principle**

Add new behaviors without modifying existing classes.

### 4. You need **double dispatch**

The visitor chooses the correct method based on:

- the visitor type
- the element type

This solves the issue where a single virtual call is not enough.

---

## Benefits

- **Easy to add new operations** (just add a new Visitor)
- **Separates algorithms from data structures**
- Encourages **single responsibility**
- Can accumulate results across the whole structure (e.g., count nodes, compute size)

---

## Drawbacks

- Harder to add new element types (must update all visitors)
- Slightly more complex design with double dispatch
- Tight coupling between elements and the Visitor interface

---

## Example Use Cases

- Compiler design: type checking, optimizing, code generation
- File system traversal: computing sizes, printing structure
- UI frameworks: rendering, event propagation
- Data exporters: JSON → XML → YAML conversions
