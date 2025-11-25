#include <iostream>
#include <string>
#include <vector>

// Memento: stores the internal state of the Originator
class Memento
{
private:
    std::string state;

public:
    Memento(const std::string &s) : state(s) {}

    std::string getState() const
    {
        return state;
    }
};

// Originator: creates and uses Mementos to save/restore its state
class Originator
{
private:
    std::string state;

public:
    void setState(const std::string &s)
    {
        state = s;
        std::cout << "Originator: state changed to \"" << state << "\"\n";
    }

    std::string getState() const
    {
        return state;
    }

    Memento saveToMemento() const
    {
        std::cout << "Originator: saving state to Memento.\n";
        return Memento(state);
    }

    void restoreFromMemento(const Memento &memento)
    {
        state = memento.getState();
        std::cout << "Originator: state restored to \"" << state << "\"\n";
    }
};

// CareTaker: keeps track of saved Mementos
class CareTaker
{
private:
    std::vector<Memento> mementos;

public:
    void add(const Memento &m)
    {
        mementos.push_back(m);
    }

    const Memento &get(std::size_t index) const
    {
        return mementos.at(index);
    }
};

int main()
{
    Originator originator;
    CareTaker careTaker;

    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveToMemento());

    originator.setState("State #3");
    careTaker.add(originator.saveToMemento());

    originator.setState("State #4");

    // Restore to previous states
    originator.restoreFromMemento(careTaker.get(0));
    originator.restoreFromMemento(careTaker.get(1));

    return 0;
}