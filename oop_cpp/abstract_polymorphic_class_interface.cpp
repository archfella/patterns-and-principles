/*
    Polymorphic class:
    ------------------
    - A polymorphic class is any class that has at least one VIRTUAL FUNCTION.
        * This enables runtime polymorphism (dynamic dispatch via virtual tables).
        * You can create objects of a polymorphic class.
        * It doesn’t have to be abstract.
*/

class Shape
{
public:
    virtual void draw(); // makes the class polymorphic
    virtual ~Shape() = default;
};

/*
    Abstract class:
    ----------------
    - An abstract class is a class that has at least one PURE VIRTUAL FUNCTION,
     But can also have:
        * data members
        * implemented methods
        * protected constructors
        * non-virtual functions
    --> Used for SHARED IMPLEMENTATION + CONTRACT.
        * It cannot be instantiated.
        * It is used as a base class only.
        * It enforces that derived classes must implement the pure virtual functions.
*/

class AbstractShape
{
public:
    virtual void draw() = 0;
    virtual ~AbstractShape() = default;
};

/*
    Interface:
    -----------

    - C++ has no “interface” keyword, but an interface is a specific style of abstract class.
    - Interface (C++ style) is a class with:
        * Only pure virtual functions.
        * No data members.
        * Trivial / empty constructors and destructors.
        * Acts purely as a contract.
*/

class IShape
{
public:
    virtual void draw() = 0;
    virtual ~IShape() = default;
};
