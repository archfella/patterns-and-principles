# Memento – Usage

The **Memento** design pattern is used to capture and restore an object's **internal state** without violating **encapsulation**.  
It lets you implement **undo / rollback**, snapshots, or state history in a clean and controlled way.

---

## Intent

- Save an object's state (**snapshot**) at a specific moment.
- Restore the state later (undo).
- Keep internal details hidden from the outside world.

The pattern involves three roles:

### **1. Originator**

The object whose state you want to save.

- Creates Mementos.
- Restores its state from a Memento.

### **2. Memento**

Stores the **internal state** of the Originator.

- Immutable.
- No one except Originator should modify or inspect it.

### **3. Caretaker**

Manages saving and restoring snapshots.

- Stores mementos.
- Never inspects their contents.

---

## When to Use Memento

Use the Memento pattern when:

- You need **undo / redo** (text editors, GUIs, games, command history).
- You want to implement **save/load** functionality.
- You want to **encapsulate state history** without exposing object internals.
- You need to support **rollback** to a previous valid state.
