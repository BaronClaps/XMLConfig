package hub.components;

public class I2C {

    public enum Type {
        ControlHubImuBHI260AP, AdafruitColorSensor, AdafruitBNO055IMU, HuskyLens, ColorSensor, ModernRoboticsI2cCompassSensor, Gyro, IrSeekerV3, ModernRoboticsI2cRangeSensor, MaxSonarI2CXL, OctoQuadFTC, REV_VL53L0X_RANGE_SENSOR, RevExternalImu, RevColorSensorV3, LynxColorSensor, LynxEmbeddedIMU, SparkFunOTOS, QWIIC_LED_STICK, goBILDAPinpoint, KauaiLabsNavxMicro,
    }

    private Type type;
    private String name;
    private int port = 0;
    private int bus = 0;

    public I2C(Type type, String name, int port, int bus) {
        this.type = type;
        this.name = name;
        this.port = port;
        this.bus = bus;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPort() {
        return port;
    }

    public int getBus() {
        return bus;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "<" + type.toString() + " name=\"" + name + "\" port=\"" + port + "\" bus=\"" + bus + "\"/>";
    }
}
