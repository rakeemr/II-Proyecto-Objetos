package Logic.Room;

import Logic.Hotel;
import java.util.ArrayList;

public class Room {
    private final int number;
    private RoomType type;
    private final ArrayList<Register> registerList;

    public Room(Hotel holder, RoomType type) {
        holder.addToRoomCount();
        this.number = holder.getRoomCount();
        this.type = type;
        this.registerList = new ArrayList();
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }
    
    public void setType(RoomType type, Hotel actualHotel, int index){
        actualHotel.deleteRoom(index);
        this.type = type;
        actualHotel.addRoom(this);
    }

    public ArrayList<Register> getRegisterList() {
        return registerList;
    }
    
    public void addRegister(Register newRegister){
        this.registerList.add(newRegister);
    }
}
