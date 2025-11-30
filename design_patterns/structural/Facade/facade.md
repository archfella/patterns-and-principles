# Facade – Usage

## When to Use

Use the **Facade** pattern when you want to:

- Provide a _simple, unified interface_ to a **complex subsystem**.
- Reduce coupling between client code and many subsystem classes.
- Hide messy initialization, configuration, or sequencing logic behind one clean API.
- Make existing code easier to use without modifying the subsystem itself.

## What It Solves

Without a facade, the client must understand:

- which subsystem classes to call,
- in what order,
- with which parameters,
- and what depends on what.

The Facade wraps all that complexity and exposes a **minimal, friendly interface**.

## Key Idea

The facade _does not replace_ subsystem classes — it simply **delegates** to them internally.  
Clients talk only to the facade; advanced users may still use subsystem classes directly.
