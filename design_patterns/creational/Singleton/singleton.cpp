class Singleton
{
public:
    static Singleton *getInstance()
    {
        if (!instance)
            instance = new Singleton();
        return instance;
    }

    virtual void operation();

protected:
    Singleton();

private:
    static Singleton *instance;
};

int main()
{ // Usage
    Singleton::getInstance()->operation();
    return 0;
}
