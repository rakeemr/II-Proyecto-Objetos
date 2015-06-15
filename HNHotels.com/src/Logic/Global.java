package Logic;

import Additional.Categorie;
import Additional.Service;
import Logic.Room.RoomType;
import Logic.User.User;
import java.util.ArrayList;
import java.util.Random;

//Singleton design pattern.
public class Global {
    public static Global instance;
    private ArrayList<User> generalUserList;
    private ArrayList<Hotel> generalHotelList;
    private ArrayList<Service> generalServiceList;
    private ArrayList<Categorie> generalCategorieList;
    private ArrayList<Reservation> completedReservations;
    private ArrayList<Reservation> canceledReservations;
    private int partnerCount;
    private int serviceCount;
    private static Cryptography crypto;
    private ArrayList<String> codes;
    
    private Global(){}
    
    public static Global getInstance(){
        if(instance == null){
            instance = new Global();
            instance.generalUserList = new ArrayList();
            instance.generalHotelList = new ArrayList();
            instance.generalServiceList = new ArrayList();
            instance.generalCategorieList = new ArrayList();
            instance.completedReservations = new ArrayList();
            instance.canceledReservations = new ArrayList();
            instance.partnerCount = 1000;
            instance.serviceCount = 0;
            crypto = new Cryptography();
            instance.codes = new ArrayList();
        }
        return instance;
    }

    public ArrayList<User> getGeneralUserList() {
        return instance.generalUserList;
    }

    public void setGeneralUserList(ArrayList<User> generalUserList) {
        instance.generalUserList = generalUserList;
    }
    
    public ArrayList<Hotel> getGeneralHotelList(){
        return instance.generalHotelList;
    }
    
    public void setGeneralHotelList(ArrayList<Hotel> generalHotelList){
        instance.generalHotelList = generalHotelList;
    }
    
    public ArrayList<Service> getGeneralServiceList(){
        return instance.generalServiceList;
    }
    
    public void setGeneralServiceList(ArrayList<Service> generalServiceList){
        instance.generalServiceList = generalServiceList;
    }

    public ArrayList<Reservation> getCompletedReservations() {
        return instance.completedReservations;
    }

    public void setCompletedReservations(ArrayList<Reservation> completedReservations) {
        instance.completedReservations = completedReservations;
    }

    public ArrayList<Reservation> getCanceledReservations() {
        return instance.canceledReservations;
    }

    public void setCanceledReservations(ArrayList<Reservation> canceledReservations) {
        instance.canceledReservations = canceledReservations;
    }

    public int getPartnerCount() {
        return instance.partnerCount;
    }

    public void setPartnerCount(int partnerCount) {
        instance.partnerCount = partnerCount;
    }

    public int getServiceCount() {
        return instance.serviceCount;
    }

    public void setServiceCount(int serviceCount) {
        instance.serviceCount = serviceCount;
    }

    public ArrayList<String> getCodes(){
        return instance.codes;
    }
    
    public void setCodes(ArrayList<String> codes){
        instance.codes = codes;
    }
    
    //Whenever a partner is added.
    public void addToPartnerCount(){
        instance.partnerCount += 1;
    }
    
    //Whenever a service is added.
    public void addToServiceCount(){
        instance.serviceCount += 1;
    }
    
    public void addUser(User newUser){
        instance.generalUserList.add(newUser);
    }
    
    public void addHotel(Hotel newHotel){
        if(instance.generalHotelList.size() > 0){
            //It is first.
            if(instance.generalHotelList.get(0).getName().compareToIgnoreCase(newHotel
            .getName()) > 0)
                instance.generalHotelList.add(0,newHotel);
            //It is the last.
            else if(instance.generalHotelList.get(instance.generalHotelList.size()-1)
            .getName().compareToIgnoreCase(newHotel.getName()) < 0)
                instance.generalHotelList.add(newHotel);
            else{
                for(int i = 0;i < instance.generalHotelList.size();i++){
                    if(instance.generalHotelList.get(i).getName().compareToIgnoreCase(newHotel
                    .getName()) > 0){
                        instance.generalHotelList.add(i,newHotel);
                        break;
                    }
                }
            }
        }
        //If the list is empty.
        else
            instance.generalHotelList.add(newHotel);
    }
    
    public void addService(Service newService){
        instance.generalServiceList.add(newService);
        instance.addToServiceCount();
    }
    
    public void addCategorie(Categorie newCategorie){
        instance.generalCategorieList.add(newCategorie);
    }
    
    public void addCode(String code){
        instance.codes.add(code);
    }
    
    public String generateCode(){
        Random random = new Random();
        String code = "#";
        String options = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
        for(int i = 0;i < 10;i++){
            code += options.charAt((int)(random.nextDouble() * (options.length()) + 0));
        }
        for(String temporalString : instance.getCodes()){
            if(temporalString.equals(code))
                return generateCode();
        }
        instance.addCode(code);
        return code;
    }
    
    public Service searchService(String serviceName){
        for(Service temporalService : instance.generalServiceList){
            if(temporalService.getName().equals(serviceName))
                return temporalService;
        }
        Service newService = new Service(serviceName);
        instance.addService(newService);
        return newService;
    }
    
    public Hotel searchHotel(String hotelName){
        for(Hotel temporalHotel : instance.generalHotelList){
            if(temporalHotel.getName().equals(hotelName))
                return temporalHotel;
        }
        return null;
    }
    
    public Categorie getCategorie(int stars){
        return instance.generalCategorieList.get(stars - 1);
    }
    
    public ArrayList<String> searchHotelsByCriterion(String criterion, String order,
    String description){
        ArrayList<Hotel> results;
        if(criterion.equals("Name"))
            results = searchByName(description);
        else if(criterion.equals("Country"))
            results = searchByCountry(description);
        else
            results = searchByAddress(description);
        if(order.equals("Popularity"))
            return orderByPopularity(results);
        else if(order.equals("Stars Number"))
            return orderByStartsNumber(results);
        else
            return orderByHostageType(results);
    }
    
    private ArrayList<String> orderByHostageType(ArrayList<Hotel> toOrder){
        ArrayList<String> results = new ArrayList();
        Hotel highter;
        while(toOrder.size() > 0){
            int i = 0;
            int max = 0;
            for(Hotel temporalHotel : toOrder){
                if(toOrder.get(max).getLodgingType().compareTo(temporalHotel
                .getLodgingType()) < 0)
                    max = i;
                i++;
            }
            highter = toOrder.get(max);
            results.add(highter.getName() + "--->Lodging type: " + highter.getLodgingType());
            toOrder.remove(max);
        }
        return results;
    }
    
    private ArrayList<String> orderByStartsNumber(ArrayList<Hotel> toOrder){
        ArrayList<String> results = new ArrayList();
        Hotel highter;
        while(toOrder.size() > 0){
            int i = 0;
            int max = 0;
            for(Hotel temporalHotel : toOrder){
                if(toOrder.get(max).getStarsNumber() < temporalHotel.getStarsNumber())
                    max = i;
                i++;
            }
            highter = toOrder.get(max);
            results.add(highter.getName() + "--->Starts: " + highter.getStarsNumber());
            toOrder.remove(max);
        }
        return results;
    }
    
    private ArrayList<String> orderByPopularity(ArrayList<Hotel> toOrder){
        ArrayList<String> results = new ArrayList();
        Hotel highter;
        while(toOrder.size() > 0){
            int i = 0;
            int max = 0;
            for(Hotel temporalHotel : toOrder){
                if(toOrder.get(max).getReservationCount() < temporalHotel.getReservationCount())
                    max = i;
                i++;
            }
            highter = toOrder.get(max);
            results.add(highter.getName() + "--->Popularity: " + highter
            .getReservationCount() * 1000 + "pts.");
            toOrder.remove(max);
        }
        return results;
    }
    
    private ArrayList<Hotel> searchByName(String name){
        ArrayList<Hotel> results = new ArrayList();
        instance.generalHotelList.stream().filter((temporalHotel) -> 
        (temporalHotel.getName().toLowerCase().contains(name.toLowerCase())))
         .forEach((temporalHotel) -> {
            results.add(temporalHotel);
        });
        return results;
    }
    
    private ArrayList<Hotel> searchByCountry(String country){
        ArrayList<Hotel> results = new ArrayList();
        instance.generalHotelList.stream().filter((temporalHotel) -> 
        (temporalHotel.getCountry().toLowerCase().contains(country.toLowerCase())))
        .forEach((temporalHotel) -> {
            results.add(temporalHotel);
        });
        return results;
    }
    
    private ArrayList<Hotel> searchByAddress(String address){
        ArrayList<Hotel> results = new ArrayList();
        instance.generalHotelList.stream().filter((temporalHotel) -> 
        (temporalHotel.getAddress().toLowerCase().contains(address.toLowerCase())))
        .forEach((temporalHotel) -> {
            results.add(temporalHotel);
        });
        return results;
    }
}
