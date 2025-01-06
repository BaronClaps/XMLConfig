import hub.*;
import hub.components.*;

public class Main {
    public static void main(String[] args) {

        Hub chub = new HubBuilder(true)
                .addMotor(new Motor(Motor.Type.goBILDA5202SeriesMotor, "e", 1))
                .addServo(new Servo(Servo.Type.Servo, "ea", 3))
                .build();

        Robot robot = new RobotBuilder()
                .addHub(chub)
                .addWebcam(new Webcam("weeeeeeee", "weeeeeeeeeeeeeeeee"))
                .build();

        robot.save("robot.xml");
    }
}
