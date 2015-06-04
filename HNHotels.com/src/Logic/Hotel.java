package Logic;

import Logic.Room.RoomType;
import Logic.Room.Room;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Hotel {
    private String name;
    private String address;
    private String country;
    private String phoneNumber;
    private int starsNumber;
    private String lodgingType;
    private String hotelSize;
    private String builtYear;
    private String checkInTime;
    private String checkOutTime;
    private int reservationCount;
    private int roomCount;
    private final ArrayList<String> checkInRequirementsList;
    private final ArrayList<Attraction> nearbyAttractionList;
    private final ArrayList<Service> servicesList;
    private final ArrayList<ImageIcon> photographsList;
    private final ArrayList<Room> roomList;
    private final ArrayList<RoomType> roomTypesAvailablesList;
    private final ArrayList<Season> seasonList;

    public Hotel(String name, String address, String country, String phoneNumber, 
    int starsNumber, String lodgingType, String hotelSize, String builtYear, 
    String checkInTime, String checkOutTime, ArrayList<String> checkInRequirementsList,
    ArrayList<Attraction> nearbyAttractionList, ArrayList<Service> servicesList,
    ArrayList<ImageIcon> photographsList) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.starsNumber = starsNumber;
        this.lodgingType = lodgingType;
        this.hotelSize = hotelSize;
        this.builtYear = builtYear;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.reservationCount = 0;
        this.roomCount = 0;
        this.checkInRequirementsList = checkInRequirementsList;
        this.nearbyAttractionList = nearbyAttractionList;
        this.servicesList = servicesList;
        this.photographsList = photographsList;
        this.roomList = new ArrayList();
        this.roomTypesAvailablesList = new ArrayList();
        this.seasonList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getStarsNumber() {
        return starsNumber;
    }

    public void setStarsNumber(int starsNumber) {
        this.starsNumber = starsNumber;
    }

    public String getLodgingType() {
        return lodgingType;
    }

    public void setLodgingType(String lodgingType) {
        this.lodgingType = lodgingType;
    }

    public String getHotelSize() {
        return hotelSize;
    }

    public void setHotelSize(String hotelSize) {
        this.hotelSize = hotelSize;
    }

    public String getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(String builtYear) {
        this.builtYear = builtYear;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getReservationCount() {
        return reservationCount;
    }

    public void setReservationCount(int reservationCount) {
        this.reservationCount = reservationCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public ArrayList<String> getCheckInRequirementsList() {
        return checkInRequirementsList;
    }

    public ArrayList<Attraction> getNearbyAttractionList() {
        return nearbyAttractionList;
    }

    public ArrayList<Service> getServicesList() {
        return servicesList;
    }

    public ArrayList<ImageIcon> getPhotographsList() {
        return photographsList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public ArrayList<RoomType> getRoomTypesAvailablesList() {
        return roomTypesAvailablesList;
    }

    public ArrayList<Season> getSeasonList() {
        return seasonList;
    }
    
    public void addToReservationCount(){
        this.reservationCount += 1;
    }
    
    public void addToRoomCount(){
        this.roomCount += 1;
    }
    
    public void addCheckInRequierement(String newRequierement){
        this.checkInRequirementsList.add(newRequierement);
    }
    
    public void deleteCheckInRequierement(int index){
        this.checkInRequirementsList.remove(index);
    }
    
    public void addNearbyAttraction(Attraction newAttraction){
        this.nearbyAttractionList.add(newAttraction);
    }
    
    public void deleteNearbyAttaction(int index){
        this.nearbyAttractionList.remove(index);
    }
    
    public void addService(Service newService){
        this.servicesList.add(newService);
    }
    
    public void deleteService(int index){
        this.servicesList.remove(index);
    }
    
    public void addPhotography(ImageIcon newPhotography){
        this.photographsList.add(newPhotography);
    }
    
    public void deletePhotography(int index){
        this.photographsList.remove(index);
    }
    
    //Sorted by number of plant insertion, from highest to lowest.
    public void addRoom(Room newRoom){
        if(this.roomList.size() > 0){
            //It is first.
            if(this.roomList.get(0).getType().getFloor() <= newRoom.getType().getFloor())
                this.roomList.add(0,newRoom);
            //It is the last.
            else if(this.roomList.get(this.roomList.size()-1).getType().getFloor()
            > newRoom.getType().getFloor())
                this.roomList.add(newRoom);
            else{
                for(int i = 1;i < this.roomList.size();i++){
                    if(this.roomList.get(i).getType().getFloor() <= newRoom.getType()
                    .getFloor()){
                        this.roomList.add(i,newRoom);
                        break;
                    }
                }
            }
        }
        //If the list is empty.
        else
            this.roomList.add(newRoom);
    }
    
    public void deleteRoom(int index){
        this.roomList.remove(index);
        this.roomCount -= 1;
    }
    
    public void addRoomType(RoomType newRoomType){
        this.roomTypesAvailablesList.add(newRoomType);
    }
    
    public void addSeason(Season newSeason){
        this.seasonList.add(newSeason);
    }
    
    public Service searchService(String serviceName){
        for(Service temporalService : this.servicesList){
            if(temporalService.getName().equals(serviceName))
                return temporalService;
        }
        return null;
    }
    
    public RoomType searchRoomType(String roomTypeName){
        for(RoomType temporalRoomType : this.roomTypesAvailablesList){
            if(temporalRoomType.getRoomType().equals(roomTypeName))
                return temporalRoomType;
        }
        return null;
    }
}
