# Proxy – Usage

The **Proxy** design pattern provides a **surrogate** or **placeholder** object that controls access to another object (the _real subject_).  
You use a Proxy when you **want to add extra behavior before or after accessing a real object**—without modifying the real object itself.

---

## ✔ When to Use the Proxy Pattern

### **1. Access Control**

Control who can call methods on an object.

**Example:**  
A `SecureProxy` checks login credentials before allowing access to a `BankAccount`.

### **2. Lazy Initialization (Virtual Proxy)**

Delay creating a heavy object until it is actually needed.

**Example:**  
Loading a big image file only when `.display()` is called.

### **3. Logging, Monitoring, or Statistics**

Record when a method is used, without changing the real object.

**Example:**  
A `LoggingProxy` prints every request to a database.

### **4. Remote Proxy (RPC, networking)**

The real object lives on a different machine, and the proxy handles communication.

**Example:**  
Calling a method on a server through a stub proxy.

### **5. Protection Proxy**

Different behavior depending on user permissions.

**Example:**  
Admin users can edit records; regular users can only view them.
