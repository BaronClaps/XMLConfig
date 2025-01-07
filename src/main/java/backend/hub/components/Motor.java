package backend.hub.components;

public class Motor {

    public enum Type {
        goBILDA5201SeriesMotor,
        goBILDA5202SeriesMotor,
        Matrix12vMotor,
        NeveRest20Gearmotor,
        NeveRest3point7v1Gearmotor,
        NeveRest40Gearmotor,
        NeveRest60Gearmotor,
        RevRobotics20HDHexMotor,
        RevRobotics40HDHexMotor,
        RevRoboticsCoreHexMotor,
        RevRoboticsUltraplanetaryHDHexMotor,
        TetrixMotor,
        UnspecificiedMotor
    }

    private Type type;
    private String name;
    private int port = 0;

    public Motor(Type type, String name, int port) {
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
        String typestring = type.toString();

        if(type == Type.UnspecificiedMotor)
            typestring = "backend.hub.components.Motor";

        if(type == Type.NeveRest3point7v1Gearmotor)
            typestring = "NeveRest3.7v1Gearmotor";

        return "<" + typestring + " name=\"" + name + "\" port=\"" + port + "\"/>";
    }
}
