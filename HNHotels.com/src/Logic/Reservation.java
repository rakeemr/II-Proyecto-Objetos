package Logic;

import Logic.Room.Room;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Reservation {
    private final ArrayList<Room> selectedRooms;
    private final GregorianCalendar checkInDate;
    private final GregorianCalendar checkOutDate;
    private int nightsNumber;
    private int totalRooms;
    private final String hotelName;
    private String state;
    private final int adultsCount;
    private final int childrenCount;

    public Reservation(ArrayList<Room> selectedRooms, GregorianCalendar checkInDate,
    GregorianCalendar checkOutDate, int nightsNumber, String hotelName, int adultsCount,
    int childrenCount) {
        this.selectedRooms = selectedRooms;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.nightsNumber = nightsNumber;
        this.totalRooms = selectedRooms.size();
        this.hotelName = hotelName;
        this.state = "Pending";
        this.adultsCount = adultsCount;
        this.childrenCount = childrenCount;
    }

    public ArrayList<Room> getSelectedRooms() {
        return selectedRooms;
    }

    public GregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    public GregorianCalendar getCheckOutDate() {
        return checkOutDate;
    }

    public int getNightsNumber() {
        return nightsNumber;
    }

    public void setNightsNumber(int nightsNumber) {
        this.nightsNumber = nightsNumber;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAdultsCount() {
        return adultsCount;
    }

    public int getChildrenCount() {
        return childrenCount;
    }
    
    public void addRoom(Room newRoom){
        this.selectedRooms.add(newRoom);
    }
}
