package Logic;

import Logic.User.User;
import java.util.ArrayList;
import java.util.Random;

//Singleton design pattern.
public class Global {
    public static Global instance;
    private ArrayList<User> generalUserList;
    private ArrayList<Hotel> generalHotelList;
    private ArrayList<Service> generalServiceList;
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

    public int getPartnerCount() {
        return instance.partnerCount;
    }

    public void setPartnerCount(int partnerCount) {
        instance.partnerCount = partnerCount;
    }

    public int getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(int serviceCount) {
        this.serviceCount = serviceCount;
    }

    public static Cryptography getCrypto() {
        return instance.crypto;
    }

    public static void setCrypto(Cryptography crypto) {
        instance.crypto = crypto;
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
        instance.generalHotelList.add(newHotel);
    }
    
    public void addService(Service newService){
        instance.generalServiceList.add(newService);
    }
    
    public void addCode(String code){
        instance.codes.add(code);
    }
    
    public String generateAlphaNumericCode(){
        Random random = new Random();
        String code = "#";
        String options = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        for(int i = 0;i < 10;i++){
            code += options.charAt((int)(random.nextDouble() * (options.length()) + 0));
        }
        for(String temporalString : instance.getCodes()){
            if(temporalString.equals(code))
                return generateAlphaNumericCode();
        }
        instance.addCode(code);
        return code;
    }
}
