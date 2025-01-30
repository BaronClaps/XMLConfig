public class Webcam {

    private String name;
    private String serialNumber;

    public Webcam(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "<Webcam name=\"" + name + "\" serialNumber=\"" + serialNumber + "\" />";
    }
}
