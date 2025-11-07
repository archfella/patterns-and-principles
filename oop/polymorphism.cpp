#include <string>

class Clock
{
public:
    Clock(int hh, int mm, int ss);

    virtual void tick();
    virtual std::string get_time();
    void set_time(int hh, int mm, int ss);

    int get_hour() { return h; }
    int get_minute() { return m; }
    int get_second() { return s; }
    bool is_midnight() { return (h == 0 && m == 0 && s == 0); }

private:
    int h, m, s;
};

/*
    ClockWithDate:
        - Needs to react differently to the 'tick' operation.
        - Needs to react differently to the 'get_time' operation.

    - Member function that will have DIFFERENT IMPLEMENTATION IN DERIVED CLASSES is declared as
    VIRTUAL in the BASE CLASS.

    - Derived class MAY OR MAY NOT specify its own definition of the virtual function. If the derived class does not
    specify its own implementation, the BASE CLASS IMPLEMENTATION IS INHERITED.

    - DETAIL: Once a function is declared as 'virtual' it stays virtual in all derived classes, so whether
    we specify the functions as virtual in the derived classes doesn't really matter.


    POLYMORPHISM MECHANISM:
        - We can use the Base class reference to call the virtual member functions. The implementation that is
        used at runtime is determined by the ACTUAL OBJECT TYPE, not the reference type.
*/

class ClockWithDate : public Clock
{
public:
    ClockWithDate(int y, int d, int h, int min, int s);

    void tick() override;
    std::string get_time() override;
    // virtual void tick();            // DETAIL: same as "void tick()"
    // virtual std::string get_time(); // DETAIL: same as "std::string get_time()"

    std::string get_date();
    void set_date(int yy, int mm, int dd);

private:
    int y, m, d;
};

void ClockWithDate::tick()
{
    Clock::tick();
    if (is_midnight())
    {
        // increment the date
    }
}

std::string ClockWithDate::get_time()
{
    // implementation ...
}