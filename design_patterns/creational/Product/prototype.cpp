class IPrototype
{
public:
    virtual ~IPrototype() = default;
    virtual IPrototype *clone() const = 0;
};

class ConcretePrototypeA : public IPrototype
{
public:
    IPrototype *clone() const override
    {
        return new ConcretePrototypeA(*this);
    }
};

class ConcretePrototypeB : public IPrototype
{
public:
    IPrototype *clone() const override
    {
        return new ConcretePrototypeB(*this);
    }
};

int main()
{
    IPrototype *prototype_1 = new ConcretePrototypeA();
    IPrototype *prototype_2 = prototype_1->clone();

    delete prototype_1;
    delete prototype_2;
    return 0;
}