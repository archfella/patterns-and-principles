/*
    Virtual Destructor:
    --------------------
        - Virtual Destructor is just another virtual function, and the same polymorphism
         principle applies to it as for any other virtual function.
        - When we want to delete a derived object using a base class pointer WE NEED A
        VIRTUAL DESTRUCTOR.
*/
#include <iostream>

class Base
{
public:
    Base() { std::cout << "Base Constructor" << std::endl; }
    virtual ~Base() { std::cout << "Base Destructor" << std::endl; }
};

class Derived : public Base
{
public:
    Derived() { std::cout << "Derived Constructor" << std::endl; }
    ~Derived() { std::cout << "Derived Destructor" << std::endl; }
};

main()
{
    Base *b = new Derived(); /*
    OUTPUT:
     Base Constructor
     Derived Constructor
    */

    delete b; /*
    OUTPUT:
      Derived Destructor
      Base Destructor
  */
};