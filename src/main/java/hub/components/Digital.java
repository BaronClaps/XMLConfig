package hub.components;

public class Digital {

    public enum Type {
        DigitalDevice,
        Led,
        RevTouchSensor
    }

    private Type type;
    private String name;
    private int port = 0;

    public Digital(Type type, String name, int port) {
        this.type = type;
        this.name = name;
        this.port = port;
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

    public void setType(Type type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "<" + type.toString() + " name=\"" + name + "\" port=\"" + port + "\"/>";
    }
}
