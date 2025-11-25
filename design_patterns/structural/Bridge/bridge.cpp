#include <iostream>

class IImplementation
{
public:
    virtual void operationImplementation() = 0;
    virtual ~IImplementation() = default;
};

class ConcreteImplementationA : public IImplementation
{
public:
    void operationImplementation() override
    {
        std::cout << "Operation implementation type A" << std::endl;
    }
};

class ConcreteImplementationB : public IImplementation
{
public:
    void operationImplementation() override
    {
        std::cout << "Operation implementation type B" << std::endl;
    }
};

class Abstraction
{
public:
    Abstraction(IImplementation *implementation)
    {
        this->implementation = implementation;
    }

    virtual void operation()
    {
        // Abstraction delegates the work to the implementation.
        implementation->operationImplementation();
    }
    virtual ~Abstraction() = default;

protected:
    IImplementation *implementation;
};

class FinalAbstraction : public Abstraction
{
public:
    FinalAbstraction(IImplementation *implementation) : Abstraction(implementation)
    {
    }

    void operation() override
    {
        std::cout << "[FinalAbstraction] Pre-processing\n";
        implementation->operationImplementation();
        std::cout << "[FinalAbstraction] Post-processing\n";
    }
};

int main()
{
    IImplementation *impl1 = new ConcreteImplementationA();
    IImplementation *impl2 = new ConcreteImplementationB();

    Abstraction *abstr1 = new Abstraction(impl1);
    Abstraction *abstr2 = new FinalAbstraction(impl2);

    delete impl1;
    delete impl2;
    delete abstr1;
    delete abstr2;
    return 0;
}