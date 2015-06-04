package Logic;

import Graphic.LogInWindow;
import Logic.Room.Register;
import Logic.Room.Room;
import Logic.Room.RoomType;
import Logic.User.Administrator;
import Logic.User.Client;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

public class HNHotelsCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Global global = Global.getInstance();
        addDefaultData(global);
        new LogInWindow().setVisible(true);
    }
    
    private static void addDefaultData(Global global){
        //Users.
        char[] password = {'1','2','3'};
        global.addUser(new Administrator("David","Vargas","Male","dva",password));
        global.addUser(new Administrator("Raquel","Mora","Female","raquemora@gmail.com",password));
        global.addUser(new Client("Michael","Mendez","Male","michael",password));
        //Services.
        global.addService(new Service("Swimming pool"));
        global.addService(new Service("TV"));
        global.addService(new Service("Restaurant"));
        global.addService(new Service("Conditioned air"));
        global.addService(new Service("Spa"));
        //Hotels.
        ArrayList<String> checkInRequirementsList = new ArrayList();
        checkInRequirementsList.add("ID");
        checkInRequirementsList.add("Previous Paid");
        checkInRequirementsList.add("Reservation");
        
        ArrayList<Attraction> nearbyAttractionList = new ArrayList();
        nearbyAttractionList.add(new Attraction("Beach"));
        nearbyAttractionList.add(new Attraction("Supermarkets"));
        nearbyAttractionList.add(new Attraction("NightClubs"));
        
        ArrayList<Service> servicesList = new ArrayList();
        servicesList.add(global.getGeneralServiceList().get(0));
        servicesList.add(global.getGeneralServiceList().get(1));
        servicesList.add(global.getGeneralServiceList().get(2));
        
        ArrayList<ImageIcon> photographsList = new ArrayList();
        photographsList.add(new ImageIcon("/Img/RIU_Hotel.jpg"));
        
        Hotel newHotel = new Hotel("RIU", "Guanacaste", "Costa Rica", "1234", 5, 
        "Rooms", "12000m2", "1979", "12:15","13:00", checkInRequirementsList,
        nearbyAttractionList, servicesList, photographsList);
        
        RoomType type1 = new RoomType("Suite",5,"Matrinomial",2,"25m2","Perfect"
        + " for people who prefer the luxurious things.",true,true,true,true,false);
        RoomType type2 = new RoomType("Single",1,"Matrinomial and Single",4,"20m2",
        "Perfect for people who want to spend a nice vacation without spending much.",
        true,false,false,false,false);
        RoomType type3 = new RoomType("Double",2,"Two matrinomial beds",4,"30m2",
        "Perfect for couples of friends who want to stay in one room.",true,false,
        true,false,true);
        
        newHotel.addRoomType(type1);
        newHotel.addRoomType(type2);
        newHotel.addRoomType(type3);
        
        Room room1 = new Room(newHotel,type1);
        
        room1.addRegister(new Register(new GregorianCalendar(2015,6,5),
        new GregorianCalendar(2015,6,8),"Alguien"));
        
        newHotel.addRoom(room1);
        newHotel.addRoom(new Room(newHotel,type1));
        newHotel.addRoom(new Room(newHotel,type2));
        newHotel.addRoom(new Room(newHotel,type2));
        newHotel.addRoom(new Room(newHotel,type2));
        newHotel.addRoom(new Room(newHotel,type2));
        newHotel.addRoom(new Room(newHotel,type3));
        
        global.addHotel(newHotel);
    }
}
