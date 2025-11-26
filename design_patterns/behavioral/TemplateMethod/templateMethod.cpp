#include <iostream>

class AbstractClass
{
public:
    void templateMethod()
    {
        primitiveOperationA();
        primitiveOperationB();
    }

    virtual void primitiveOperationA() = 0;
    virtual void primitiveOperationB() = 0;
    virtual ~AbstractClass() = default;
};

class ConcreteClass : public AbstractClass
{
public:
    void primitiveOperationA() override
    {
        std::cout << "ConcreteClass: Operation A\n";
    }

    void primitiveOperationB() override
    {
        std::cout << "ConcreteClass: Operation B\n";
    }
};

int main()
{
    AbstractClass *abstractClass = new ConcreteClass();
    abstractClass->templateMethod();
    return 0;
}