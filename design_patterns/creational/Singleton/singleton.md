# Consequences of the Singleton Pattern (with Examples)

## 1. Controlled Access to the Singleton Instance

You can control who gets access to the singleton by validating parameters passed to `getInstance()`. If the access credentials are bad, the method can return `nullptr` (or throw an exception).

### C++ Example

```cpp
class Singleton {
private:
    static Singleton* instance;
    Singleton() {}  // private constructor

public:
    static Singleton* getInstance(const std::string& token) {
        if (instance == nullptr) {
            if (token == "VALID_ACCESS") {
                instance = new Singleton();
            } else {
                return nullptr; // deny creation
            }
        }
        return instance;
    }
};

Singleton* Singleton::instance = nullptr;

int main() {
    Singleton* s1 = Singleton::getInstance("BAD_ACCESS");   // s1 = nullptr
    Singleton* s2 = Singleton::getInstance("VALID_ACCESS"); // s2 = instance
}
```

---

## 2. Reduced Global Namespace Pollution

Since the object lives inside a class rather than as a global variable, the global namespace stays clean.

### C++ Example

```cpp
// Instead of:
Logger globalLogger; // pollutes global namespace

// We do:
Logger& logger = Logger::getInstance();
logger.log("Hello");
```

---

## 3. Support for Inheritance

Singletons can have subclasses, allowing behavior refinement.

### C++ Example

```cpp
class Printer {
public:
    virtual void print() = 0;
    virtual ~Printer() = default;
};

class PDFPrinter : public Printer {
public:
    void print() override { std::cout << "Printing PDF"; }
};

class PrinterSingleton {
private:
    static Printer* instance;
    PrinterSingleton() {}

public:
    static Printer* getInstance() {
        if (!instance) instance = new PDFPrinter();
        return instance;
    }
};
```

---

## 4. Controlled Number of Instances

You can extend the pattern so the system decides how many instances to allow.

### C++ Example: Pool of 3 Instances

```cpp
class LimitedSingleton {
private:
    static inline std::vector<LimitedSingleton*> pool;
    static const int MAX = 3;

    LimitedSingleton() {}

public:
    static LimitedSingleton* getInstance() {
        if (pool.size() < MAX) {
            pool.push_back(new LimitedSingleton());
        }
        return pool.back();
    }
};
```

---

## 5. More Flexible Than Static Functions (Supports Polymorphism)

Static-only classes cannot use polymorphism, but singletons can.

### C++ Example

```cpp
class Storage {
public:
    virtual void save() = 0;
    virtual ~Storage() = default;
};

class FileStorage : public Storage {
public:
    void save() override { std::cout << "Saving to file"; }
};

class StorageSingleton {
private:
    static Storage* instance;

public:
    static Storage* getInstance() {
        if (!instance) instance = new FileStorage();
        return instance;
    }
};

Storage* s = StorageSingleton::getInstance();
s->save(); // polymorphic
```
