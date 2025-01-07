package backend;

import backend.hub.Hub;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Robot {
    private List<Hub> hubs = new ArrayList<>();
    private List<Webcam> webcams = new ArrayList<>();
    private List<EthernetDevice> ethernetDevices = new ArrayList<>();

    public void addHub(Hub hub) {
        hubs.add(hub);
    }

    public void addWebcam(Webcam webcam) {
        webcams.add(webcam);
    }

    public void addEthernetDevice(EthernetDevice ethernetDevice) {
        ethernetDevices.add(ethernetDevice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("<Robot type=\"FirstInspires-FTC\">");

        if(!hubs.isEmpty()) {
            sb.append("<LynxUsbDevice name=\"Control Hub Portal\" serialNumber=\"(embedded)\" parentModuleAddress=\"173\">");
        }

        for (Hub hub : hubs) {
            sb.append(hub.toString());
        }

        if(!hubs.isEmpty()) {
            sb.append("</LynxUsbDevice>");
        }

        for (Webcam webcam : webcams) {
            sb.append(webcam.toString());
        }

        for (EthernetDevice ethernetDevice : ethernetDevices) {
            sb.append(ethernetDevice.toString());
        }

        sb.append("</Robot>");

        return sb.toString();
    }

    public void save(String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write("<?xml version='1.0' encoding='UTF-8' standalone='yes' ?>");
            fileWriter.write(this.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String view() {
        return "\"<?xml version='1.0' encoding='UTF-8' standalone='yes' ?>\"" + this.toString();
    }
}
