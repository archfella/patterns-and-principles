#include <iostream>
#include <vector>

class IComponent
{
public:
    virtual void operation() = 0;
    virtual ~IComponent() = default;
};

class Leaf : public IComponent
{
public:
    void operation() override
    {
        std::cout << "Leaf operation implementation" << std::endl;
    }
};

class Composite : public IComponent
{
public:
    void operation() override
    {
        std::cout << "Composite operation start" << std::endl;
        for (auto c : components)
            c->operation(); // recursively call child operations
        std::cout << "Composite operation end" << std::endl;
    }

    void addComponent(IComponent *component)
    {
        components.push_back(component);
    }

    void removeComponent(IComponent *component)
    {
        components.erase(std::remove(components.begin(), components.end(), component), components.end());
    }

    IComponent *getComponent(int ind) const
    {
        if (ind < 0 || ind >= components.size())
            return nullptr;
        return components[ind];
    }

private:
    std::vector<IComponent *> components;
};

int main()
{
    // Create leaves
    Leaf *leaf1 = new Leaf();
    Leaf *leaf2 = new Leaf();
    Leaf *leaf3 = new Leaf();

    // Create composites
    Composite *composite1 = new Composite();
    Composite *composite2 = new Composite();

    // Build hierarchy
    composite1->addComponent(leaf1);
    composite1->addComponent(leaf2);

    composite2->addComponent(composite1); // nested composite
    composite2->addComponent(leaf3);

    // Call operation on top-level composite
    composite2->operation();

    // Clean up memory
    delete leaf1;
    delete leaf2;
    delete leaf3;
    delete composite1;
    delete composite2;

    return 0;
}