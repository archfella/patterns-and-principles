/*
    Constructor:
        - Every time the object is created the constructor is called (absolutely without exception).
*/

class Clock
{
    // Compiler adds the implicit constructor: Clock() {}
};
Clock c; // Compiler automatically adds the implicit constructor - OK

class Clock
{
    // We define our own constructor - the compiler doesn't add the default constructor
public:
    Clock(int h, int m, int s) {}
};
Clock c;                          // Error - there is no default constructor
Clock *c = new Clock(23, 25, 36); // OK

/*
    Destructor:
        - Every time the object lifetime is ended the destructor is called (absolutely without exception).
*/

void main()
{
    {
        Clock c(1, 2, 3);
    } // <-- STACK: Object goes out of scope - object lifecycle ends IMPLICITLY (destructor is called).

    Clock *p = new Clock(1, 2, 3);
    delete p; // <-- HEAP: Destructor is called - object lifecycle ends EXPLICITLY (destructor is called).
}