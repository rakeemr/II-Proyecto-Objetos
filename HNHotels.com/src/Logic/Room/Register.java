package Logic.Room;

import java.util.GregorianCalendar;

public class Register {
    private final GregorianCalendar checkInDate;
    private final GregorianCalendar checkOutDate;
    private final String responsiblePerson;
    private int adultsCount;
    private int childrenCount;

    public Register(GregorianCalendar checkInDate, GregorianCalendar checkOutDate,
    String responsiblePerson) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.responsiblePerson = responsiblePerson;
        this.adultsCount = 0;
        this.childrenCount = 0;
    }

    public GregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    public GregorianCalendar getCheckOutDate() {
        return checkOutDate;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public int getAdultsCount() {
        return adultsCount;
    }

    public void setAdultsCount(int adultsCount) {
        this.adultsCount = adultsCount;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }
}
