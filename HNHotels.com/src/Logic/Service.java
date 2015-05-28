package Logic;

public class Service {
    private final int code;
    private final String name;

    public Service(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
