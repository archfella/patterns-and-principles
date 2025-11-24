class Product
{
public:
    void use() {}
    void show() {}
    int attrib_1;
    char attrib_2;
    float attrib_3;
};

class IBuilder
{
public:
    virtual void buildPartA() = 0;
    virtual void buildPartB() = 0;
    virtual void buildPartC() = 0;
    virtual Product *getProduct() = 0;
    virtual ~IBuilder() = default;
};

class ConcreteBuilder_A : public IBuilder
{
public:
    ConcreteBuilder_A()
    {
        product = new Product();
    }

    ~ConcreteBuilder_A()
    {
        delete product;
    }

    void buildPartA() override
    {
        product->attrib_1 = 1;
    }

    void buildPartB() override
    {
        product->attrib_2 = 'A';
    }

    void buildPartC() override
    {
        product->attrib_3 = 10.15;
    }

    Product *getProduct() override
    {
        /*
            NOTE: We return a copy of a Product and not an actual Product because we don't want to expose
            internal pointers. Only the owner of an object should delete its internal objects (pointers).
            If we give the original pointer to the user, the user doesn't know if he should delete the pointer or no.
        */

        return new Product(*product);
    }

private:
    Product *product;
};

class ConcreteBuilder_B : public IBuilder
{
public:
    ConcreteBuilder_B()
    {
        product = new Product();
    }

    ~ConcreteBuilder_B()
    {
        delete product;
    }

    void buildPartA() override
    {
        product->attrib_1 = 2;
    }

    void buildPartB() override
    {
        product->attrib_2 = 'B';
    }

    void buildPartC() override
    {
        product->attrib_3 = 20.25;
    }

    Product *getProduct() override
    {
        return new Product(*product);
    }

private:
    Product *product;
};

class Director
{
public:
    void constructFullProduct(IBuilder *builder)
    {
        builder->buildPartA();
        builder->buildPartB();
        builder->buildPartC();
    }

    void constructSimpleProduct(IBuilder *builder)
    {
        builder->buildPartA();
    }
};

int main()
{
    Director director;
    IBuilder *builderA = new ConcreteBuilder_A();

    director.constructFullProduct(builderA);
    Product *product1 = builderA->getProduct();
    product1->show();

    IBuilder *builderB = new ConcreteBuilder_B();

    director.constructSimpleProduct(builderB);
    Product *product2 = builderB->getProduct();
    product2->show();

    delete builderA;
    delete product1;
    delete builderB;
    delete product2;
    return 0;
}
