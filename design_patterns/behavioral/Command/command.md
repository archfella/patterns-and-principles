# Command – Usage

The **Command** design pattern turns a request into a **standalone object**.  
This allows you to parameterize methods with commands, queue them, store them, undo them, or log them.

It decouples:

- **The object that invokes an operation** (Invoker)
- **The object that actually performs the operation** (Receiver)

---

## Intent

- Encapsulate a request as an object
- Support **undo/redo**, logging, command queues, and macros
- Decouple _what is done_ from _how it is done_

---

## When to Use the Command Pattern

### **1. Undo/Redo functionality**

Store previous states or inverse commands.

Example:  
Text editor undo stack (typing, deleting, formatting).

### **2. Command history / logging**

Keep a history of executed actions.

Example:  
Storing executed database queries.

### **3. Queued or scheduled commands**

Execute commands later or in order.

Example:  
Task scheduler, game engine event queue.

### **4. GUI buttons / menu items**

Each button can map to a command object.

Example:  
"Copy", "Paste", "Save", "Delete" as commands.

### **5. Macro commands**

Combine multiple commands into one.

Example:  
“Build & Run” in IDE (runs multiple steps).

---

## Roles in the Pattern

### **1. Command (Interface)**

Declares the `execute()` method.

### **2. ConcreteCommand**

Implements the command and stores a reference to the Receiver.

### **3. Receiver**

Knows how to perform the actual work.

### **4. Invoker**

Triggers command execution.

### **5. Client**

Creates the command objects and assigns them to the invoker.
