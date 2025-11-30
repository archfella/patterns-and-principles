package Facade.java;

public class Program {

    public static void main(String[] args) {
        AudioSystem audioSystem = new AudioSystem();
        VideoSystem videoSystem = new VideoSystem();
        StreamingService streamingService = new StreamingService();

        HomeTheaterFacade facade = new HomeTheaterFacade(audioSystem, videoSystem, streamingService);

        facade.watchMovie("john.doe", "The Facade Awakens");
        System.out.println();
        facade.endMovie();
    }
}
