# Observer – Usage

The **Observer** pattern defines a one-to-many dependency:  
when one object (**Subject**) changes its state, all dependent objects (**Observers**) are automatically notified.

It is useful when you want to maintain consistency between related objects without tightly coupling them.

---

## When to Use the Observer Pattern

### 1. One object should notify many others

Whenever a single state change must update multiple components (UI panels, logs, dependent objects, etc.).

### 2. You want loose coupling

Observers do not need to know details about the subject.  
The subject does not need to know who the observers are.

### 3. You need dynamic subscription / unsubscription

Observers can be added or removed at runtime.

### 4. You want a reactive, event-driven system

The Observer pattern is the basis for:

- Event listeners
- UI frameworks
- Reactive programming
- Messaging systems

---

## Example Use Cases

- **GUI systems** → buttons notify listeners when clicked
- **Game development** → entities react to health changes, environment events
- **Stock market app** → stock data service notifies charts, logs, alerts
- **File watcher** → any file change notifies tools/services

---

## Benefits

- **Loose coupling** between subject and observers
- **Flexible**: observers can be added/removed dynamically
- **Open for extension**: adding new observers requires no subject changes

---

## Drawbacks

- Observers may cause unexpected updates or chain reactions
- Debugging can be harder (indirect communication)
- If many observers exist → performance overhead
