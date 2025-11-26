#include <iostream>
#include <vector>

class ConcreteElementA;
class ConcreteElementB;

class Visitor
{
public:
    virtual void visit(ConcreteElementA *element) = 0;
    virtual void visit(ConcreteElementB *element) = 0;
    virtual ~Visitor() = default;
};

class ConcreteElementA
{
public:
    void accept(Visitor *visitor)
    {
        visitor->visit(this);
    }

    std::string getDataA() const { return "Data from Element A"; }
};

class ConcreteElementB
{
public:
    void accept(Visitor *visitor)
    {
        visitor->visit(this);
    }

    int getDataB() const { return 42; }
};

class ConcreteVisitor1 : public Visitor
{
public:
    void visit(ConcreteElementA *element) override
    {
        std::cout << "ConcreteVisitor1 visiting ElementA: "
                  << element->getDataA() << std::endl;
    }

    void visit(ConcreteElementB *element) override
    {
        std::cout << "ConcreteVisitor1 visiting ElementB: "
                  << element->getDataB() << std::endl;
    }
};

class ConcreteVisitor2 : public Visitor
{
public:
    void visit(ConcreteElementA *element) override
    {
        std::cout << "ConcreteVisitor2 processing ElementA differently: "
                  << element->getDataA().length() << " characters" << std::endl;
    }

    void visit(ConcreteElementB *element) override
    {
        std::cout << "ConcreteVisitor2 processing ElementB differently: "
                  << element->getDataB() * 2 << std::endl;
    }
};

int main()
{
    ConcreteElementA elementA;
    ConcreteElementB elementB;

    ConcreteVisitor1 visitor1;
    ConcreteVisitor2 visitor2;

    std::cout << "=== Visitor 1 ===" << std::endl;
    elementA.accept(&visitor1);
    elementB.accept(&visitor1);

    std::cout << "\n=== Visitor 2 ===" << std::endl;
    elementA.accept(&visitor2);
    elementB.accept(&visitor2);

    return 0;
}