package Facade.java;

public class AudioSystem {

    public void on() {
        System.out.println("AudioSystem: on");
    }

    public void setVolume(int level) {
        System.out.println("AudioSystem: volume set to " + level);
    }

    public void off() {
        System.out.println("AudioSystem: off");
    }
}
