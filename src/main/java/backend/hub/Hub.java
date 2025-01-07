package backend.hub;

import backend.hub.components.*;

import java.util.ArrayList;
import java.util.List;

public class Hub {

    private boolean controlHub = true;
    private List<Motor> motors = new ArrayList<>();
    private List<Servo> servos = new ArrayList<>();
    private List<Analog> analogs = new ArrayList<>();
    private List<Digital> digitals = new ArrayList<>();
    private List<I2C> i2cs = new ArrayList<>();

    public Hub(boolean controlHub) {
        this.controlHub = controlHub;
    }

    public void addMotor(Motor motor) {
        motors.add(motor);
    }

    public void addServo(Servo servo) {
        servos.add(servo);
    }

    public void addAnalog(Analog analog) {
        analogs.add(analog);
    }

    public void addDigital(Digital digital) {
        digitals.add(digital);
    }

    public void addI2C(I2C i2c) {
        i2cs.add(i2c);
    }

    public boolean isControlHub() {
        return controlHub;
    }

    @Override
    public String toString() {
        String header;

        if(controlHub) {
            header = "<LynxModule name=\"Control Hub\" port=\"173\">";
        } else {
            header = "<LynxModule name=\"Expansion Hub 2\" port=\"2\">";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(header);
        for(Motor motor : motors) {
            sb.append(motor);
        }
        for(Servo servo : servos) {
            sb.append(servo);
        }
        for(Analog analog : analogs) {
            sb.append(analog);
        }
        for(Digital digital : digitals) {
            sb.append(digital);
        }
        for(I2C i2c : i2cs) {
            sb.append(i2c);
        }
        sb.append("</LynxModule>");

        return sb.toString();
    }
}
