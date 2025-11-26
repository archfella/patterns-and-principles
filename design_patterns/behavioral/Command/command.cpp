#include <iostream>
#include <memory>
#include <vector>

class Receiver
{
public:
    void action()
    {
        std::cout << "Actual receiver operation" << std::endl;
    }
};

class Command
{
public:
    virtual ~Command() = default;
    virtual void execute() = 0;
};

class ConcreteCommand : public Command
{
public:
    ConcreteCommand(Receiver *receiver) : receiver(receiver), state(0) {}

    void execute() override
    {
        receiver->action();
    }

private:
    Receiver *receiver;
    int state;
};

// We inject the Command into Invoker.
class Invoker
{
public:
    void setCommand(Command *cmd)
    {
        command = cmd;
    }

    void executeCommand()
    {
        if (command)
        {
            command->execute();
        }
    }

private:
    Command *command;
};

int main()
{
    Receiver receiver;
    ConcreteCommand command(&receiver);

    Invoker invoker;
    invoker.setCommand(&command);
    invoker.executeCommand();

    return 0;
}