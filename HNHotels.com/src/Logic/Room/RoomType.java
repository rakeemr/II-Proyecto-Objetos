package Logic.Room;

public class RoomType {
    private final String roomType;
    private int floor;
    private String bedType;
    private int maxOfPeople;
    private String roomSize;
    private String description;
    private boolean hasSalon;
    private boolean hasTerrace;
    private boolean hasSeaview;
    private boolean allIncluded;
    private boolean smokePermission;

    public RoomType(String roomType, int floor, String bedType, int maxOfPeople, 
    String roomSize, String description, boolean hasSalon, boolean hasTerrace, 
    boolean hasSeaview, boolean allIncluded, boolean smokePermission) {
        this.roomType = roomType;
        this.floor = floor;
        this.bedType = bedType;
        this.maxOfPeople = maxOfPeople;
        this.roomSize = roomSize;
        this.description = description;
        this.hasSalon = hasSalon;
        this.hasTerrace = hasTerrace;
        this.hasSeaview = hasSeaview;
        this.allIncluded = allIncluded;
        this.smokePermission = smokePermission;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public int getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(int maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasSalon() {
        return hasSalon;
    }

    public void setHasSalon(boolean hasSalon) {
        this.hasSalon = hasSalon;
    }

    public boolean isHasTerrace() {
        return hasTerrace;
    }

    public void setHasTerrace(boolean hasTerrace) {
        this.hasTerrace = hasTerrace;
    }

    public boolean isHasSeaview() {
        return hasSeaview;
    }

    public void setHasSeaview(boolean hasSeaview) {
        this.hasSeaview = hasSeaview;
    }

    public boolean isAllIncluded() {
        return allIncluded;
    }

    public void setAllIncluded(boolean allIncluded) {
        this.allIncluded = allIncluded;
    }

    public boolean isSmokePermission() {
        return smokePermission;
    }

    public void setSmokePermission(boolean smokePermission) {
        this.smokePermission = smokePermission;
    }
}
