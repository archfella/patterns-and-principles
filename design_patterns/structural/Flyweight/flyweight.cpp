#include <iostream>
#include <string>
#include <unordered_map>
/*
    Intrinsic state
        - Shared among multiple objects.
        - Stored inside the flyweight.
        - Example: the glyph shape of a character, or the texture of a tree in a game.

    Extrinsic state
        - Not shared, varies per usage.
        - Supplied externally by the client.
        - Example: position of a tree on the map, or the location of a character in a document.
*/

struct ExtrinsicState
{
    int x;
    int y;
    // Context-specific data that varies per instance
};

struct IntrinsicState
{
    std::string texture;
    std::string color;
    // Shared data that remains constant across instances

    IntrinsicState(const std::string &tex, const std::string &col)
        : texture(tex), color(col) {}
};

class IFlyweight
{
public:
    virtual void operation(ExtrinsicState state) = 0;
    virtual ~IFlyweight() = default;
};

class ConcreteFlyweight : public IFlyweight
{
public:
    ConcreteFlyweight(const std::string &texture, const std::string &color)
        : intrinsic(texture, color) {}

    void operation(ExtrinsicState extrinsic) override
    {
        // Use intrinsic state (shared) and extrinsic state (context-specific)
        // Example: render object at position (extrinsic.x, extrinsic.y)
        // using texture and color from intrinsic state
        render(extrinsic, intrinsic);
    }

private:
    void render(ExtrinsicState extrinsic, IntrinsicState intrinsic)
    {
        // some rendering that uses both shared and internal state ...
    }
    IntrinsicState intrinsic;
};

class FlyweightFactory
{
private:
    std::unordered_map<std::string, ConcreteFlyweight *> flyweights;

    std::string getKey(const std::string &texture, const std::string &color)
    {
        return texture + "_" + color;
    }

public:
    ConcreteFlyweight *getFlyweight(const std::string &texture, const std::string &color)
    {
        std::string key = getKey(texture, color);

        if (flyweights.find(key) == flyweights.end())
        {
            flyweights[key] = new ConcreteFlyweight(texture, color);
        }

        return flyweights[key];
    }

    size_t getFlyweightCount() const
    {
        return flyweights.size();
    }

    ~FlyweightFactory()
    {
        for (auto &pair : flyweights)
        {
            delete pair.second;
        }
        flyweights.clear();
    }
};

int main()
{
    FlyweightFactory factory;

    ExtrinsicState state1{10, 20};
    ExtrinsicState state2{50, 80};

    auto tree1 = factory.getFlyweight("Oak", "Green");
    auto tree2 = factory.getFlyweight("Oak", "Green"); // reused

    tree1->operation(state1);
    tree2->operation(state2);

    std::cout << "Flyweights created: " << factory.getFlyweightCount() << std::endl;

    return 0;
}