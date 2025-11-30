package Facade.java;

public class StreamingService {

    public void connect(String user) {
        System.out.println("StreamingService: connected as '" + user + "'");
    }

    public void play(String title) {
        System.out.println("StreamingService: playing '" + title + "'");
    }

    public void disconnect() {
        System.out.println("StreamingService: disconnected");
    }
}
