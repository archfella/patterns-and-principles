import motor.HAL;

public class SpeedAdapter implements WithSpeed {
    private HAL hal = HAL.getInstance();
    public int convert(int num) {
        return num * 100;
    }

    @Override
    public void setSpeed(int num) {
        int sp = convert(num);
        hal.setSpeed(sp);
    }
}
