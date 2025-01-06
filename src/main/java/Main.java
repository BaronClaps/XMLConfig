import hub.*;
import hub.components.*;

public class Main {
    public static void main(String[] args) {

        Hub chub = new HubBuilder(true)
                .addMotor(new Motor(Motor.Type.goBILDA5202SeriesMotor, "e", 1))
                .addMotor(new Motor(Motor.Type.goBILDA5202SeriesMotor, "lf", 0))
                .addServo(new Servo(Servo.Type.Servo, "ea", 3))
                .addAnalog(new Analog(Analog.Type.AnalogInput, "analog", 2))
                .addDigital(new Digital(Digital.Type.DigitalDevice, "a", 1))
                .addI2C(new I2C(I2C.Type.LynxEmbeddedIMU, "a", 0, 1))
                .build();

        Hub ehub = new HubBuilder(false)
                .addMotor(new Motor(Motor.Type.goBILDA5201SeriesMotor, "eaz", 3))
                .addServo(new Servo(Servo.Type.ContinuousRotationServo, "edsaa", 3))
                .addAnalog(new Analog(Analog.Type.OpticalDistanceSensor, "analodasg", 2))
                .addDigital(new Digital(Digital.Type.RevTouchSensor, "aas", 1))
                .addI2C(new I2C(I2C.Type.ColorSensor, "aaa", 0, 1))
                .build();

        Robot robot = new RobotBuilder()
                .addHub(chub)
                .addHub(ehub)
                .addWebcam(new Webcam("192.168.2", "2121babsd"))
                .addEthernetDevice(new EthernetDevice("asdjh", "limelight", 2, "192.168.42.1"))
                .build();

        robot.save("robot.xml");

        System.out.println(robot.view());
    }
}
