package motor;

public class HAL {

    private static HAL instance = null;
    private DriverCounter driverCounter;
    private DriverDCDrive driverDCDrive;
    private DriverMotor driverMotor;

    private HAL(DriverCounter driverCounter, DriverDCDrive driverDCDrive, DriverMotor driverMotor) {
        this.driverCounter = driverCounter;
        this.driverDCDrive = driverDCDrive;
        this.driverMotor = driverMotor;
    }

    public static HAL getInstance() {
        if (instance == null) {
            instance = new HAL(new DriverCounter(), new DriverDCDrive(), new DriverMotor());
        }
        return instance;
    }

    public void setSpeed(int sp) {
        driverDCDrive.write(sp);
        driverCounter.reset();
        driverMotor.turnOn();
    }
}
