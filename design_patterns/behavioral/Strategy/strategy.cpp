#include <iostream>

class IStrategy
{
public:
    virtual ~IStrategy() = default;
    virtual void execute() const = 0;
};

class ConcreteStrategyA : public IStrategy
{
public:
    void execute() const override
    {
        std::cout << "Executing Strategy A" << std::endl;
    }
};

class ConcreteStrategyB : public IStrategy
{
public:
    void execute() const override
    {
        std::cout << "Executing Strategy B" << std::endl;
    }
};

class ConcreteStrategyC : public IStrategy
{
public:
    void execute() const override
    {
        std::cout << "Executing Strategy C" << std::endl;
    }
};

class Context
{
public:
    Context() : strategy(nullptr) {}

    void setStrategy(IStrategy *newStrategy)
    {
        strategy = newStrategy;
    }

    void doWork() const
    {
        if (strategy)
        {
            strategy->execute();
        }
        else
        {
            std::cout << "No strategy set" << std::endl;
        }
    }

private:
    IStrategy *strategy;
};

int main()
{
    Context context;

    ConcreteStrategyA strategyA;
    context.setStrategy(&strategyA);
    context.doWork();

    ConcreteStrategyB strategyB;
    context.setStrategy(&strategyB);
    context.doWork();

    ConcreteStrategyC strategyC;
    context.setStrategy(&strategyC);
    context.doWork();

    return 0;
}