

public class EthernetDevice {

    private String serialNumber;
    private String name;
    private int port = 0;
    private String ipAddress;

    public EthernetDevice(String serialNumber, String name, int port, String ipAddress) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.port = port;
        this.ipAddress = ipAddress;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public int getPort() {
        return port;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "<EthernetDevice serialNumber=\"" + serialNumber +"\" name=\"" + name +"\" port=\"" + port +"\" ipAddress=\"" + ipAddress + "\" />";
    }
}
