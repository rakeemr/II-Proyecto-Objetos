package Logic;

import Logic.Room.SimpleRoom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Season {
    private final String name;
    private final String code;
    private final GregorianCalendar startDate;
    private final GregorianCalendar endDate;
    private final ArrayList<SimpleRoom> simpleRoomList;
    private int visitsCount;

    public Season(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        this.name = name;
        this.code = generateSeasonCode(name, startDate, endDate);
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
    
    private String generateSeasonCode(String name, GregorianCalendar startDate,
    GregorianCalendar endDate){
        String newCode = "";
        if(name.length() >= 2)
            newCode += name.substring(0, 1);
        else
            newCode += name.charAt(0);
        newCode += startDate.get(Calendar.MONTH);
        newCode += Integer.toString(startDate.get(Calendar.YEAR)).substring(2, 3);
        newCode += endDate.get(Calendar.MONTH);
        newCode += Integer.toString(endDate.get(Calendar.YEAR)).substring(2, 3);
        return newCode;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", code: " + code + ", start date: " + startDate
        .get(Calendar.DAY_OF_MONTH) + "/" + startDate.get(Calendar.MONTH) + ", end date: "
        + endDate.get(Calendar.DAY_OF_MONTH) + "/" + endDate.get(Calendar.MONTH);
    }
}
