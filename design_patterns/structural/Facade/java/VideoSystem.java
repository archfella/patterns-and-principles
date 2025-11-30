package Facade.java;

public class VideoSystem {

    public void on() {
        System.out.println("VideoSystem: on");
    }

    public void setInput(String source) {
        System.out.println("VideoSystem: input source set to '" + source + "'");
    }

    public void off() {
        System.out.println("VideoSystem: off");
    }
}
