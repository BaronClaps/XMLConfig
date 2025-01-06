import hub.*;
import hub.components.*;

public class Main {
    public static void main(String[] args) {
        // Create a new hub.components.Servo object
        Servo servo = new Servo(Servo.Type.Servo, "Servo1", 0);
        Analog a = new Analog(Analog.Type.AnalogInput, "Analog1", 0);
        Digital d = new Digital(Digital.Type.DigitalDevice, "Digital1", 0);
        Motor m = new Motor(Motor.Type.NeveRest20Gearmotor, "Motor1", 0);
        I2C i = new I2C(I2C.Type.AdafruitBNO055IMU, "I2C1", 0, 1);
        Digital d2 = new Digital(Digital.Type.Led, "Digital2", 1);

        Hub hub = new HubBuilder(true)
            .addServo(servo)
            .addAnalog(a)
            .addDigital(d)
            .addMotor(m)
            .addI2C(i)
            .addDigital(d2)
            .build();

        Robot robot = new RobotBuilder()
                .addHub(hub)
                .build();

        robot.save("robot.xml");
    }
}
