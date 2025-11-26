#include <iostream>
#include <string>
#include <memory>

class Colleague;

class Mediator
{
public:
    virtual ~Mediator() = default;
    virtual void notify(Colleague *sender, const std::string &event) = 0;
};

class Colleague
{
protected:
    Mediator *mediator;

public:
    Colleague(Mediator *med = nullptr) : mediator(med) {}
    virtual ~Colleague() = default;
    void setMediator(Mediator *med) { mediator = med; }
};

class ConcreteColleague1 : public Colleague
{
public:
    ConcreteColleague1(Mediator *med = nullptr) : Colleague(med) {}

    void doA()
    {
        std::cout << "Colleague1: Doing A\n";
        mediator->notify(this, "A");
    }

    void doB()
    {
        std::cout << "Colleague1: Doing B\n";
        mediator->notify(this, "B");
    }
};

class ConcreteColleague2 : public Colleague
{
public:
    ConcreteColleague2(Mediator *med = nullptr) : Colleague(med) {}

    void doC()
    {
        std::cout << "Colleague2: Doing C\n";
        mediator->notify(this, "C");
    }

    void doD()
    {
        std::cout << "Colleague2: Doing D\n";
        mediator->notify(this, "D");
    }
};

// Complex Colleague interaciton logic
class ConcreteMediator : public Mediator
{
private:
    ConcreteColleague1 *colleague1;
    ConcreteColleague2 *colleague2;

public:
    void setColleague1(ConcreteColleague1 *c1) { colleague1 = c1; }
    void setColleague2(ConcreteColleague2 *c2) { colleague2 = c2; }

    void notify(Colleague *sender, const std::string &event) override
    {
        if (event == "A")
        {
            std::cout << "Mediator reacts to A and triggers:\n";
            colleague2->doC();
        }
        else if (event == "D")
        {
            std::cout << "Mediator reacts to D and triggers:\n";
            colleague1->doB();
        }
    }
};

int main()
{
    ConcreteColleague1 c1;
    ConcreteColleague2 c2;
    ConcreteMediator mediator;

    c1.setMediator(&mediator);
    c2.setMediator(&mediator);
    mediator.setColleague1(&c1);
    mediator.setColleague2(&c2);

    std::cout << "Client triggers operation A:\n";
    c1.doA();

    std::cout << "\nClient triggers operation D:\n";
    c2.doD();

    return 0;
}
