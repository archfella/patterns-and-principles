#include <iostream>

// Adaptee class needs to have the 'targetOperation()' method.
class Adaptee
{
public:
    void adapteeOperation()
    {
        std::cout << "Adaptee operation" << std::endl;
    }
};

class Target
{
public:
    virtual void targetOperation()
    {
        std::cout << "Target operation" << std::endl;
    }

    virtual ~Target() = default;
};

class Adapter : public Target
{
public:
    void targetOperation() override
    {
        adaptee->adapteeOperation();
    }

    Adapter(Adaptee *adaptee)
    {
        this->adaptee = adaptee;
    }

private:
    Adaptee *adaptee;
};

int main()
{
    Adaptee *adaptee = new Adaptee();
    Adapter *adapter = new Adapter(adaptee);

    adapter->targetOperation();

    delete adapter;
    delete adaptee;
    return 0;
}