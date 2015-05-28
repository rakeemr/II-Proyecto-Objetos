package Logic;

public class Attraction {
    private String code;
    private String name;

    public Attraction(String name) {
        this.code = Global.getInstance().generateCode();
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
