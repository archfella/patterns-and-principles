class Product
{
public:
    virtual ~Product();
    virtual void use() = 0;
};

class ConcreteProduct : public Product
{
public:
    ConcreteProduct();
    void use() override {}
};

class Factory
{
public:
    void operation()
    {
        // ...
        Product *product = factoryMethod();
        // ...
    }
    virtual Product *factoryMethod() = 0;

protected:
    Factory();
};

class ConcreteFactory : public Factory
{
    Product *factoryMethod() override
    {
        return new ConcreteProduct();
    }
};

int main()
{
    Factory *concreteFactory = new ConcreteFactory();
    Product *product = concreteFactory->factoryMethod();
    product->use();

    delete product;
    delete concreteFactory;
    return 0;
}