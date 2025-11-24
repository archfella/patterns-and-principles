class IProductA
{
public:
    virtual ~IProductA() = default;
    virtual void use() = 0;
};

class IProductB
{
public:
    virtual ~IProductB() = default;
    virtual void use() = 0;
};

class ConcreteProductA_Black : public IProductA
{
public:
    void use() override {}
};

class ConcreteProductB_Black : public IProductB
{
public:
    void use() override {}
};

class ConcreteProductA_White : public IProductA
{
public:
    void use() override {}
};

class ConcreteProductB_White : public IProductB
{
public:
    void use() override {}
};

class AbstractFactory
{
public:
    virtual IProductA *createProductA() = 0;
    virtual IProductB *createProductB() = 0;
    virtual ~AbstractFactory() = default;
};

class ConcreteFactoryBlack : public AbstractFactory
{
public:
    IProductA *createProductA() override
    {
        return new ConcreteProductA_Black();
    }

    IProductB *createProductB() override
    {
        return new ConcreteProductB_Black();
    }
};

class ConcreteFactoryWhite : public AbstractFactory
{
public:
    IProductA *createProductA() override
    {
        return new ConcreteProductA_White();
    }

    IProductB *createProductB() override
    {
        return new ConcreteProductB_White();
    }
};

int main()
{
    AbstractFactory *abstractFactory_Black = new ConcreteFactoryBlack();
    IProductA *productA_Black = abstractFactory_Black->createProductA();
    productA_Black->use();

    AbstractFactory *abstractFactory_White = new ConcreteFactoryWhite();
    IProductB *productB_White = abstractFactory_White->createProductB();
    productB_White->use();

    delete abstractFactory_Black;
    delete abstractFactory_White;
    delete productA_Black;
    delete productB_White;
    return 0;
}