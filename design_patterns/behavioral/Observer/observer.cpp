#include <iostream>
#include <vector>
#include <string>

class Observable
{
public:
    void attach(Observer *observer)
    {
        observers.push_back(observer);
    }

    void detach(Observer *observer)
    {
        observers.erase(std::remove(observers.begin(), observers.end(), observer), observers.end());
    }

protected:
    void notify()
    {
        for (auto *observer : observers)
        {
            observer->update(this, state);
        }
    }

    int state{0};

private:
    std::vector<Observer *> observers;
};

class ConcreteObservable : public Observable
{
public:
    void setState(int newState)
    {
        state = newState;
        notify();
    }

    int getState() const
    {
        return state;
    }
};

class Observer
{
public:
    virtual ~Observer() = default;
    virtual void update(Observable *source, int state) = 0;
};

class ConcreteObserverA : public Observer
{
public:
    void update(Observable *source, int state) override
    {
        std::cout << "Observer A notified. New state = " << state << std::endl;
    }
};

class ConcreteObserverB : public Observer
{
public:
    void update(Observable *source, int state) override
    {
        std::cout << "Observer B notified. New state = " << state << std::endl;
    }
};

int main()
{
    ConcreteObservable observable;
    ConcreteObserverA observerA;
    ConcreteObserverB observerB;

    observable.attach(&observerA);
    observable.attach(&observerB);

    std::cout << "Setting state to 1" << std::endl;
    observable.setState(1);

    std::cout << "Setting state to 2" << std::endl;
    observable.setState(2);

    observable.detach(&observerA);
    std::cout << "Detached Observer A, setting state to 3" << std::endl;
    observable.setState(3);

    return 0;
}