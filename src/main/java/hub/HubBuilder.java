package hub;

import hub.components.*;

import java.util.ArrayList;
import java.util.List;

public class HubBuilder {
    private boolean controlHub;
    private List<Motor> motors = new ArrayList<>();
    private List<Servo> servos = new ArrayList<>();
    private List<Analog> analogs = new ArrayList<>();
    private List<Digital> digitals = new ArrayList<>();
    private List<I2C> i2cs = new ArrayList<>();

    public HubBuilder(boolean controlHub) {
        this.controlHub = controlHub;
    }

    public HubBuilder addMotor(Motor motor) {
        this.motors.add(motor);
        return this;
    }

    public HubBuilder addServo(Servo servo) {
        this.servos.add(servo);
        return this;
    }

    public HubBuilder addAnalog(Analog analog) {
        this.analogs.add(analog);
        return this;
    }

    public HubBuilder addDigital(Digital digital) {
        this.digitals.add(digital);
        return this;
    }

    public HubBuilder addI2C(I2C i2c) {
        this.i2cs.add(i2c);
        return this;
    }

    public Hub build() {
        Hub hub = new Hub(controlHub);
        for (Motor motor : motors) {
            hub.addMotor(motor);
        }
        for (Servo servo : servos) {
            hub.addServo(servo);
        }
        for (Analog analog : analogs) {
            hub.addAnalog(analog);
        }
        for (Digital digital : digitals) {
            hub.addDigital(digital);
        }
        for (I2C i2c : i2cs) {
            hub.addI2C(i2c);
        }
        return hub;
    }
}