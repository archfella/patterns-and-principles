# Prototype – Usage

The Prototype pattern is used to **create new objects by copying existing ones**, instead of instantiating them from scratch.  
This is useful when object creation is **expensive**, **complex**, or when you want to **avoid large constructor logic**.

---

## When to Use Prototype

---

### **1. Object creation is costly**

(heavy initialization, database loading, asset preparation)

```cpp
class HeavyObject {
public:
    std::vector<int> largeData;

    HeavyObject() {
        // Simulate heavy initialization
        largeData.resize(1'000'000, 42);
    }

    std::unique_ptr<HeavyObject> clone() const {
        return std::make_unique<HeavyObject>(*this); // copying is cheap
    }
};

HeavyObject prototype;          // heavy initialization happens once
auto copy = prototype.clone();  // cheap copy
```

### **2. We need many similar objects**

(we only tweak a few fields after cloning)

```cpp
class Enemy {
public:
    int hp = 100;
    int damage = 10;
    std::string type = "Orc";

    std::unique_ptr<Enemy> clone() const {
        return std::make_unique<Enemy>(*this);
    }
};

Enemy orcPrototype;

auto weakOrc = orcPrototype.clone();
weakOrc->hp = 50;

auto bossOrc = orcPrototype.clone();
bossOrc->hp = 300;
bossOrc->damage = 25;
```

### **3. We want to avoid complex constructors**

(we just clone the object without calling the constructor with a large number of parameters)

```cpp
class Button {
public:
    std::string text;
    std::string color;
    int borderRadius;

    Button(std::string t, std::string c, int br)
        : text(t), color(c), borderRadius(br) {}

    std::unique_ptr<Button> clone() const {
        return std::make_unique<Button>(*this);
    }
};

// Create one fully-styled prototype
Button primaryPrototype("OK", "blue", 8);

// Clone it many times without repeating constructor parameters
auto b1 = primaryPrototype.clone();
auto b2 = primaryPrototype.clone();
```

### **4. The object’s exact type should be decided at runtime**

(we can take the user input and instantiate an object based on the input dynamically)

```cpp
class Prototype {
public:
    virtual std::unique_ptr<Prototype> clone() const = 0;
    virtual void info() const = 0;
    virtual ~Prototype() = default;
};

class A : public Prototype {
public:
    std::unique_ptr<Prototype> clone() const override {
        return std::make_unique<A>(*this);
    }
    void info() const override { std::cout << "A\n"; }
};

class B : public Prototype {
public:
    std::unique_ptr<Prototype> clone() const override {
        return std::make_unique<B>(*this);
    }
    void info() const override { std::cout << "B\n"; }
};

// Runtime registry
std::unordered_map<std::string, std::unique_ptr<Prototype>> registry;

registry["A"] = std::make_unique<A>();
registry["B"] = std::make_unique<B>();

// Runtime decision:
std::string userChoice;
std::cout << "Enter prototype name (A or B): ";
std::cin >> userChoice;
auto obj = registry[userChoice]->clone();
obj->info(); // prints B
```

### **5. Flexibility without class explosion**

(we can create new types at runtime without creating new object subclasses)

```cpp
class Weapon {
public:
    std::string name = "Sword";
    int damage = 10;
    int range = 1;

    std::unique_ptr<Weapon> clone() const {
        return std::make_unique<Weapon>(*this);
    }
};

// Instead of creating subclasses like LongSword, FireSword, IceSword...
Weapon baseSword;

// Define new variants at runtime:
auto longSword = baseSword.clone();
longSword->name = "Long Sword";
longSword->range = 2;

auto fireSword = baseSword.clone();
fireSword->name = "Fire Sword";
fireSword->damage = 15;

// No subclasses created — everything done via cloning
```
