package Logic.Room;

public class SimpleRoom {
    private final String roomType;
    private final int amount;

    public SimpleRoom(String roomType, int amount) {
        this.roomType = roomType;
        this.amount = amount;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getAmount() {
        return amount;
    }  
}
