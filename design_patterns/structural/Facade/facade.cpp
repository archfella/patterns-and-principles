// Simple Facade pattern example in C++
// The goal is to show how a Facade coordinates
// several complex subsystems behind a single interface.

#include <iostream>
#include <string>

// --- Subsystem A ----------------------------------------------------------

class AudioSystem
{
public:
    void on()
    {
        std::cout << "AudioSystem: on" << std::endl;
    }

    void setVolume(int level)
    {
        std::cout << "AudioSystem: volume set to " << level << std::endl;
    }

    void off()
    {
        std::cout << "AudioSystem: off" << std::endl;
    }
};

// --- Subsystem B ----------------------------------------------------------

class VideoSystem
{
public:
    void on()
    {
        std::cout << "VideoSystem: on" << std::endl;
    }

    void setInput(const std::string &source)
    {
        std::cout << "VideoSystem: input source set to '" << source << "'" << std::endl;
    }

    void off()
    {
        std::cout << "VideoSystem: off" << std::endl;
    }
};

// --- Subsystem C ----------------------------------------------------------

class StreamingService
{
public:
    void connect(const std::string &user)
    {
        std::cout << "StreamingService: connected as '" << user << "'" << std::endl;
    }

    void play(const std::string &title)
    {
        std::cout << "StreamingService: playing '" << title << "'" << std::endl;
    }

    void disconnect()
    {
        std::cout << "StreamingService: disconnected" << std::endl;
    }
};

// --- Facade ---------------------------------------------------------------

class HomeTheaterFacade
{
public:
    HomeTheaterFacade(AudioSystem *audio,
                      VideoSystem *video,
                      StreamingService *streaming)
        : audio_(audio), video_(video), streaming_(streaming) {}

    void watchMovie(const std::string &user, const std::string &movieTitle)
    {
        std::cout << "HomeTheaterFacade: preparing to watch a movie..." << std::endl;

        audio_->on();
        audio_->setVolume(15);

        video_->on();
        video_->setInput("Streaming");

        streaming_->connect(user);
        streaming_->play(movieTitle);

        std::cout << "HomeTheaterFacade: enjoy the movie!" << std::endl;
    }

    void endMovie()
    {
        std::cout << "HomeTheaterFacade: shutting movie down..." << std::endl;

        streaming_->disconnect();
        video_->off();
        audio_->off();

        std::cout << "HomeTheaterFacade: system is off." << std::endl;
    }

private:
    AudioSystem *audio_;
    VideoSystem *video_;
    StreamingService *streaming_;
};

// --- Client code ----------------------------------------------------------

int main()
{
    AudioSystem audio;
    VideoSystem video;
    StreamingService streaming;

    HomeTheaterFacade facade(&audio, &video, &streaming);

    facade.watchMovie("john.doe", "The Facade Awakens");
    std::cout << std::endl;
    facade.endMovie();

    return 0;
}
