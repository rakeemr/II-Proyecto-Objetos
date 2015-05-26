package Logic;

import Logic.Room.SimpleRoom;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Season {
    private final String name;
    private final String code;
    private final GregorianCalendar startDate;
    private final GregorianCalendar endDate;
    private final ArrayList<SimpleRoom> simpleRoomList;
    private int visitsCount;

    public Season(String name, String code, GregorianCalendar startDate, GregorianCalendar endDate) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
        this.simpleRoomList = new ArrayList();
        this.visitsCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public ArrayList<SimpleRoom> getSimpleRoomList() {
        return simpleRoomList;
    }

    public int getVisitsCount() {
        return visitsCount;
    }

    public void setVisitsCount(int visitsCount) {
        this.visitsCount = visitsCount;
    }
    
    public void addSimpleRoom(SimpleRoom newSimpleRoom){
        this.simpleRoomList.add(newSimpleRoom);
    }
}
