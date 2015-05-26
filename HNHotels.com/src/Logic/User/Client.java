package Logic.User;

import Logic.Card;
import Logic.Global;
import Logic.Reservation;
import java.util.ArrayList;

public class Client extends User{
    private final int partnerNumber;
    private String country;
    private String phoneNumber;
    private String preferenceMoney;
    private final ArrayList<Card> cardList;
    private final ArrayList<Reservation> reservationList;

    public Client(String country, String phoneNumber, String preferenceMoney, 
    String name, String lastName, String gender, String email, char[] password) {
        super(name, lastName, gender, email, password);
        Global global = Global.getInstance();
        global.addToPartnerCount();
        this.partnerNumber = global.getPartnerCount();
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.preferenceMoney = preferenceMoney;
        this.cardList = new ArrayList();
        this.reservationList = new ArrayList();
    }    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPreferenceMoney() {
        return preferenceMoney;
    }

    public void setPreferenceMoney(String preferenceMoney) {
        this.preferenceMoney = preferenceMoney;
    }

    public int getPartnerNumber() {
        return partnerNumber;
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }
    
    public void addCard(Card newCard){
        this.cardList.add(newCard);
    }
    
    public void addReservation(Reservation newReservation){
        this.reservationList.add(newReservation);
    }
    
    public void reserve(){
        
    }
    
    public void cancelReservation(){
        
    }
}
