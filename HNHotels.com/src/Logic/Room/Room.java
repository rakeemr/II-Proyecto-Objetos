package Logic.Room;

import Logic.Hotel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
    
    public boolean checkAvailability(GregorianCalendar checkInDate, GregorianCalendar
    checkOutDate){
        int startDay = checkInDate.get(Calendar.DAY_OF_YEAR);
        int endDay = checkOutDate.get(Calendar.DAY_OF_YEAR);
        int temporalStartDay, temporalEndDay;
        for(Register temporalRegister : this.registerList){
            if(temporalRegister.isCanceled()){
                temporalStartDay = temporalRegister.getCheckInDate().get(Calendar.DAY_OF_YEAR);
                temporalEndDay = temporalRegister.getCheckOutDate().get(Calendar.DAY_OF_YEAR);
                if((startDay == temporalStartDay) || (startDay == temporalEndDay) ||
                (endDay == temporalStartDay) || (endDay == temporalEndDay))
                    return false;
                else if((temporalStartDay < startDay && startDay < temporalEndDay) || 
                (temporalStartDay < endDay && endDay < temporalEndDay) || 
                (startDay < temporalStartDay && temporalStartDay < endDay) || 
                (startDay < temporalEndDay && temporalEndDay < endDay))
                    return false;
            }
        }
        return true;
    }
}
