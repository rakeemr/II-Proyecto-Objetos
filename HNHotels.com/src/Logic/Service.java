package Logic;

public class Service {
    private final int code;
    private final String name;

    public Service(String name) {
        this.code = Global.getInstance().getServiceCount();
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
