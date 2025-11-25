#include <iostream>
#include <string>

class Subject
{
public:
    virtual ~Subject() = default;
    virtual void request(const std::string &payload) = 0;
};

class RealSubject : public Subject
{
public:
    void request(const std::string &payload) override
    {
        std::cout << "RealSubject: handling request with payload: " << payload << "\n";
    }
};

class Proxy : public Subject
{
private:
    RealSubject *realSubject;
    bool accessGranted;

public:
    Proxy()
        : realSubject(nullptr), accessGranted(false) {}

    ~Proxy()
    {
        delete realSubject;
    }

    void setAccess(bool granted)
    {
        accessGranted = granted;
    }

    void request(const std::string &payload) override
    {
        if (!checkAccess())
        {
            std::cout << "Proxy: access denied. Cannot forward request.\n";
            return;
        }

        if (realSubject == nullptr)
        {
            std::cout << "Proxy: creating RealSubject on demand.\n";
            realSubject = new RealSubject();
        }

        logAccess(payload);
        realSubject->request(payload);
    }

private:
    bool checkAccess()
    {
        std::cout << "Proxy: checking access...\n";
        return accessGranted;
    }

    void logAccess(const std::string &payload)
    {
        std::cout << "Proxy: logging access for payload: " << payload << "\n";
    }
};

int main()
{
    Proxy proxy;

    proxy.setAccess(false);
    proxy.request("First call");

    proxy.setAccess(true);
    proxy.request("Second call");

    return 0;
}