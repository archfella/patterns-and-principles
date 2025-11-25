# Factory – Usage

The Factory pattern defines a common interface for creating objects, but lets subclasses decide **which specific class to instantiate**.  
Because it delegates object creation to subclasses, it is sometimes called a **“Virtual Constructor.”**

## When to Use It

- When the exact type of object to create should be determined at runtime.
- When you want to decouple object creation from object usage.
- When you expect the system to grow with new product types.
