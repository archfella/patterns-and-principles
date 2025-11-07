class Clock
{
private:
    int h, m, s;

public:
    Clock(int h, int m, int s);
    void set_time(int h, int m, int s);
    void show();
};

class ClockWithDate : public Clock
{
    /*
        - Inherits all ATTRIBUTES and METHODS.
        - Adds NEW attributes and methods.
    */

private:
    int y, mo, d; // NEW attributes

public:
    ClockWithDate(int h, int m, int s, int y, int mo, int d);
    void set_date(int y, int mo, int d); // NEW method
    void show_date();                    // NEW method
    void show_all();                     // NEW method
};

void main()
{
    Clock *clock = new Clock(15, 30, 12);
    clock->set_time(20, 13, 13);
    ((ClockWithDate *)clock)->show_date(); // ! UNDEFINED BEHAVIOR !

    Clock *clock_date = new ClockWithDate(5, 32, 9, 1, 1, 2025);
    clock_date->set_time(6, 32, 52);
    ((ClockWithDate *)clock_date)->show_date(); // OK

    ClockWithDate *clock_date_2 = new ClockWithDate(18, 14, 1, 23, 8, 2023);
    clock_date_2->show_date(); // OK
}