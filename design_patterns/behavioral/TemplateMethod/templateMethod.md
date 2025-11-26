# Template Method – Usage

The **Template Method** pattern defines the _skeleton_ of an algorithm in a base class  
while allowing subclasses to override specific steps _without_ modifying the algorithm’s structure.

It is used when multiple classes share the same workflow but differ in certain details.

---

## When to Use the Template Method Pattern

### 1. You have an algorithm with fixed steps

Some steps are always the same, others change depending on the subclass.

Example:

- Preparing coffee vs. preparing tea
- Loading, parsing, and processing a file
- Game character actions with shared initialization

### 2. You want to enforce a common structure

The parent class guarantees the order of operations and prevents subclasses  
from breaking the algorithm.

### 3. You want to share logic while allowing customization

Common code stays in the base class, and subclass-specific logic goes into overridden methods.

---

## Benefits

- **Code reuse** — shared logic written once in the base class
- **Clear algorithm structure** enforced by the template
- **Easy extension** by creating new subclasses
- **Follows the Hollywood Principle**:  
  _“Don’t call us; we’ll call you.”_  
  (The template method calls subclass methods.)

---

## Drawbacks

- Can lead to **inheritance rigidity**
- Subclasses must follow the given algorithm, even if slightly inconvenient
- Not as flexible as composition-based patterns like Strategy

---

## Example Use Cases

- Document generation pipelines
- Build processes (compile → link → package)
- AI behavior sequences
- Data parsing and processing workflows
