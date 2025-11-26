# Strategy – Usage

The **Strategy** pattern defines a family of algorithms, encapsulates each one,  
and makes them interchangeable at runtime.

It allows the behavior of a class to be changed without modifying its code.

---

## When to Use the Strategy Pattern

### 1. You need multiple variations of the same algorithm

Examples:

- Different sorting methods
- Various payment methods
- Different compression strategies

Instead of `if/else` or `switch` chains, strategies keep logic modular.

### 2. You want to swap behavior at runtime

e.g. switch from “aggressive AI” to “defensive AI” dynamically.

### 3. You want to follow OCP (Open/Closed Principle)

The client is open to new behaviors (new strategies)  
**without** modifying existing code.

### 4. You want to isolate specific algorithms

Strategies help you:

- Keep each algorithm in its own class
- Make code easier to test
- Improve maintainability and readability

---

## Benefits

- Eliminates large `if-else` / `switch` statements
- Each algorithm is in a separate, clean class
- Behavior can change at runtime
- Respects SOLID principles (OCP + SRP)

---

## Drawbacks

- More classes (one per strategy)
- Client must understand differences between strategies

---

## Example Use Cases

- **Payment systems**: card, PayPal, crypto strategies
- **Sorting algorithms**: quicksort, mergesort, heapsort
- **Game AI behaviors**
- **Compression**: zip, rar, tar algorithms
