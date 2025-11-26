# Mediator – Usage

The **Mediator** pattern centralizes communication between multiple objects.  
Instead of objects calling each other directly, they interact **only through a mediator**, which reduces coupling and simplifies collaboration logic.

---

## When to Use the Mediator Pattern

### 1. Many objects need to communicate

When interactions between objects become complex and tightly coupled, Mediator organizes and centralizes this communication.

### 2. You want to reduce dependencies

Colleague objects do **not** reference each other.  
They depend only on the mediator, making the system more modular and easier to maintain.

### 3. You want a single place for interaction logic

Rules for how objects should interact are stored in one place (the mediator), instead of being spread across many classes.

### 4. You want to easily extend or modify interactions

Changing the mediator changes system behavior **without modifying the individual components**.

---

## Example Scenario

### Chat room system

- Each user sends messages _to the mediator_ (chat room)
- Chat room forwards messages to all other users
- Users remain simple, and do not depend on each other

This avoids a fully connected network of users referencing every other user.

---

## Benefits

- **Loose coupling** between components
- **Centralized logic** for communication
- **Better maintainability** and organization
- **Easier scalability** (adding new components requires no changes to others)

---

## Drawbacks

- Mediator can grow large and complex (“god object”)
- Moves complexity to one place (but still more manageable)
