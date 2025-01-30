import hub.Hub;

import java.util.ArrayList;
import java.util.List;

public class RobotBuilder {
    private List<Hub> hubs = new ArrayList<>();
    private List<Webcam> webcams = new ArrayList<>();
    private List<EthernetDevice> ethernetDevices = new ArrayList<>();

    public RobotBuilder addHub(Hub hub) {
        hubs.add(hub);
        return this;
    }

    public RobotBuilder addWebcam(Webcam webcam) {
        webcams.add(webcam);
        return this;
    }

    public RobotBuilder addEthernetDevice(EthernetDevice ethernetDevice) {
        ethernetDevices.add(ethernetDevice);
        return this;
    }

    public Robot build() {
        Robot robot = new Robot();
        for (Hub hub : hubs) {
            robot.addHub(hub);
        }
        for (Webcam webcam : webcams) {
            robot.addWebcam(webcam);
        }
        for (EthernetDevice ethernetDevice : ethernetDevices) {
            robot.addEthernetDevice(ethernetDevice);
        }

        return robot;
    }

}
