#include <string>
/*
    - We need to have ONLY ONE INSTANCE of the class.
    - We want to have a GLOBAL ACCESS POINT to that instance.
    - We want to DERIVE from a Singleton class. A client DOES NOT need to change his code to use the derived class object.
    - In general, we can limit the number of objects to ANY NUMBER of instances.
*/

class PriorityScheduler : public Scheduler
{
private:
    int nextPriority = 1;

public:
    PriorityScheduler();

    void schedule(const std::string &task) override;

    void execute() override;

    ~PriorityScheduler();
};

/* ------------------------------------------------ */

class FIFOScheduler : public Scheduler
{
public:
    FIFOScheduler();

    void schedule(const std::string &task) override;

    void execute() override;

    ~FIFOScheduler();
};

/* ------------------------------------------------ */

class Scheduler
{
protected:
    static Scheduler *_instance;
    Scheduler();

public:
    static Scheduler *instance()
    {
        if (_instance == nullptr)
        {
            _instance = new Scheduler();
        }
        return _instance;
    }

    static void set_type(const std::string &type)
    {
        if (_instance != nullptr)
        {
            delete _instance;
            _instance = nullptr;
        }

        if (type == "FIFO")
        {
            _instance = new FIFOScheduler();
        }
        else if (type == "Priority")
        {
            _instance = new PriorityScheduler();
        }
        else
        {
            _instance = new Scheduler();
        }
    }

    virtual void schedule(const std::string &task);

    virtual void execute();

    virtual ~Scheduler();
};

/* ------------------------------------------------ */
/* CLIENT CODE */
/* ------------------------------------------------ */

void client_code()
{
    /*
        Client only ever sees the Scheduler class and its interface but can set the scheduler to
        another type by calling the set_type function.
    */
    Scheduler *s = Scheduler::instance();

    s->schedule("Task A");
    s->schedule("Task B");
    s->schedule("Task C");

    s->execute();
    s->execute();
}

void main()
{
    client_code(); // client_code uses the base Scheduler class

    Scheduler::set_type("FIFO");
    client_code(); // client_code uses the FIFOScheduler class

    Scheduler::set_type("Priority");
    client_code(); // client_code uses the PriorityScheduler class
}
