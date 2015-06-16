package Logic.Room;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Register {
    private final GregorianCalendar checkInDate;
    private final GregorianCalendar checkOutDate;
    private final String responsiblePerson;
    private int adultsCount;
    private int childrenCount;
    private final String dateCode;
    private boolean canceled;

    public Register(GregorianCalendar checkInDate, GregorianCalendar checkOutDate,
    String responsiblePerson, int adultsCount, int childrenCount) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.responsiblePerson = responsiblePerson;
        this.adultsCount = adultsCount;
        this.childrenCount = childrenCount;
        this.dateCode = generateCode(checkInDate, checkOutDate);
        this.canceled = false;
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

    public String getDateCode() {
        return dateCode;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
    
    private String generateCode(GregorianCalendar checkInDate, GregorianCalendar checkOutDate){
        return checkInDate.get(Calendar.DAY_OF_MONTH) + "/" + checkInDate
        .get(Calendar.MONTH) + "/" + checkInDate.get(Calendar.YEAR) + "-" + 
        checkOutDate.get(Calendar.DAY_OF_MONTH) + "/" + checkOutDate.get(Calendar.MONTH) 
        + "/" + checkOutDate.get(Calendar.YEAR);
    }
}
