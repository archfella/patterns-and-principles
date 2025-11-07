
#include <iostream>
#include <string>
#include <vector>
#include <memory>

/*
    STRATEGY:

    Problem: When we have a family of similar sorting algorithms they are all called via the 'sort()'
    method and separated by conditional statements:

        void sort(){
            if(cond1){
                // quick sort
            }
            else if(cond2){
                // bubble sort
            }
            else if(cond3){
                // merge sort
            }
        }

    --> this means that each time we want to add a new type of sorting algorithm we need to OPEN the 'sort()'
    method and CHANGE it (this violates the open/closed principle - open for extension, closed for modification).

    - When we have a FAMILY OF SIMILAR ALGORITHMS, we can encapsulate each algorithm in a
    SEPARATE CLASS.
    - Algorithms are interchangeable at runtime.
    - Clients can choose which algorithm to use without modifying the client code.
    - We can easily add new algorithm implementation by just defining a new class and injecting it into the CONTEXT class.
*/

#include <iostream>
#include <string>
#include <vector>

// Strategy Interface - defines common interface for all algorithms
class Compositor
{
public:
    virtual ~Compositor() = default;
    virtual void compose(const std::string &text) = 0;
};

// Concrete Strategy 1 - Simple composition
class SimpleCompositor : public Compositor
{
public:
    void compose(const std::string &text) override
    {
        // ...
    }
};

// Concrete Strategy 2 - TeX-style composition
class TeXCompositor : public Compositor
{
public:
    void compose(const std::string &text) override
    {
        // ...
    }
};

// Concrete Strategy 3 - Array/grid composition
class ArrayCompositor : public Compositor
{
public:
    void compose(const std::string &text) override
    {
        // ...
    }
};

// Context - uses a Compositor strategy
class Composition
{
private:
    Compositor *compositor; // access point to the compositor interface
    std::string content;

public:
    // Actual interface implementation is injected
    Composition(Compositor *comp)
        : compositor(comp), content("") {}

    // Destructor - does not delete compositor (not owned)
    ~Composition()
    {
        // compositor is not deleted here - external management
    }

    // Can change strategy at runtime
    void setCompositor(Compositor *comp)
    {
        compositor = comp;
    }

    void setContent(const std::string &text)
    {
        content = text;
    }

    // Delegates to the strategy
    void repair()
    {
        if (compositor)
        {
            compositor->compose(content);
        }
    }
};

// Example usage
void main()
{

    // Create strategies
    SimpleCompositor *simple = new SimpleCompositor();
    TeXCompositor *tex = new TeXCompositor();
    ArrayCompositor *array = new ArrayCompositor();

    // Create composition (CONTEXT) with SimpleCompositor strategy
    Composition doc(simple);
    doc.setContent("Hello World");
    doc.repair();

    // Inject TeXCompositor at runtime (change strategy to TexCompositor)
    doc.setCompositor(tex);
    doc.setContent("Mathematical Formula");
    doc.repair();

    // Inject ArrayCompositor at runtime (change strategy to ArrayCompositor)
    doc.setCompositor(array);
    doc.setContent("Grid Data");
    doc.repair();

    // Clean up
    delete simple;
    delete tex;
    delete array;
}