package Facade.java;

public class HomeTheaterFacade {

    private final AudioSystem audioSystem;
    private final VideoSystem videoSystem;
    private final StreamingService streamingService;

    public HomeTheaterFacade(AudioSystem audioSystem, VideoSystem videoSystem, StreamingService streamingService) {
        this.audioSystem = audioSystem;
        this.videoSystem = videoSystem;
        this.streamingService = streamingService;
    }

    public void watchMovie(String user, String movieTitle) {
        System.out.println("HomeTheaterFacade: preparing to watch a movie...");

        audioSystem.on();
        audioSystem.setVolume(15);

        videoSystem.on();
        videoSystem.setInput("Streaming");

        streamingService.connect(user);
        streamingService.play(movieTitle);

        System.out.println("HomeTheaterFacade: enjoy the movie!");
    }

    public void endMovie() {
        System.out.println("HomeTheaterFacade: shutting movie down...");

        streamingService.disconnect();
        videoSystem.off();
        audioSystem.off();

        System.out.println("HomeTheaterFacade: system is off.");
    }
}
