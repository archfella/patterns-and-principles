#include <iostream>

struct State
{
    int x, y, z;
    char a, b, c;
};

class IComponent
{
public:
    virtual void operation() = 0;
    virtual ~IComponent() = default;
};

class ConcreteComponent : public IComponent
{
public:
    void operation() override
    {
        std::cout << "Component operation implementation" << std::endl;
    }
};

class Decorator : public IComponent
{
public:
    Decorator(IComponent *comp) : component(comp) {}
    virtual void operation() = 0;
    virtual ~Decorator() { delete component; } // delete wrapped component

protected:
    IComponent *component; // wraps another component
};

class ConcreteDecoratorExtendingFunctionality : public Decorator
{
public:
    ConcreteDecoratorExtendingFunctionality(IComponent *comp) : Decorator(comp) {}

    void operation() override
    {
        component->operation(); // delegate to wrapped component
        additionalOperation();  // add extra behavior
    }

    void additionalOperation()
    {
        std::cout << "Decorator adds extra functionality!" << std::endl;
    }
};

class ConcreteDecoratorExtendingState : public Decorator
{
public:
    ConcreteDecoratorExtendingState(IComponent *comp, const State &s)
        : Decorator(comp), additionalState(s) {}

    void operation() override
    {
        component->operation(); // delegate to wrapped component
        std::cout << "Decorator adds state: "
                  << "x=" << additionalState.x
                  << ", y=" << additionalState.y
                  << ", z=" << additionalState.z
                  << std::endl;
    }

private:
    State additionalState;
};

int main()
{
    // Base component
    IComponent *component = new ConcreteComponent();

    // Decorator adding functionality
    IComponent *decorator1 = new ConcreteDecoratorExtendingFunctionality(component);

    // Decorator adding state
    State mockState{1, 2, 3, 'a', 'b', 'c'};
    IComponent *decorator2 = new ConcreteDecoratorExtendingState(decorator1, mockState);

    // Execute
    decorator2->operation();

    delete decorator2;

    return 0;
}
