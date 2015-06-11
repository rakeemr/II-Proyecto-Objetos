package Logic;

import Additional.Attraction;
import Additional.Categorie;
import Additional.Service;
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
        global.addUser(new Administrator("Raquel","Mora","Female","rkm",password));
        global.addUser(new Client("Michael","Mendez","Male","michael",password));
        global.addUser(new Client("Leiver", "Jimenez", "Male", "leiju@gmail.com", password));
        global.addUser(new Client("Laura", "Piedra", "Female", "galleta@gmail.com", password));
        global.addUser(new Client("Keilor", "Jimenez", "Male", "cache@gmail.com", password));
        //Categories.
        global.addCategorie(new Categorie("70%","The best hotel around."));
        global.addCategorie(new Categorie("60%","You should try this."));
        global.addCategorie(new Categorie("55%","There's nothing that we don't have."));
        global.addCategorie(new Categorie("50%","You won't find another."));
        global.addCategorie(new Categorie("47%","Come here, it's a beautiful place."));
        //Services.
        global.addService(new Service("Swimming pool"));
        global.addService(new Service("TV"));
        global.addService(new Service("Restaurant"));
        global.addService(new Service("Conditioned air"));
        global.addService(new Service("Spa"));
        global.addService(new Service("Refrigerator"));
        global.addService(new Service("Bathtub"));
        //Hotel1.
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
        Room room2 = new Room(newHotel,type2);
        Room room3 = new Room(newHotel,type3);
        
        room1.addRegister(new Register(new GregorianCalendar(2015,6,5),
        new GregorianCalendar(2015,6,8),"Alguien",2,0));
        room2.addRegister(new Register(new GregorianCalendar(2015,10,5),
        new GregorianCalendar(2015,10,8),"Sujeto",2,2));
        room3.addRegister(new Register(new GregorianCalendar(2015,3,9),
        new GregorianCalendar(2015,3,13),"Pepe",4,0));
        
        newHotel.addRoom(room1);
        newHotel.addRoom(room2);
        newHotel.addRoom(room3);
        newHotel.addRoom(new Room(newHotel,type2));
        newHotel.addRoom(new Room(newHotel,type2));
        newHotel.addRoom(new Room(newHotel,type2));
        newHotel.addRoom(new Room(newHotel,type3));
        
        global.addHotel(newHotel);
        //Hotel2
        ArrayList<String> checkInRequirementsList2 = new ArrayList();
        checkInRequirementsList2.add("ID");
        checkInRequirementsList2.add("Previous Paid");
        checkInRequirementsList2.add("Reservation");
        checkInRequirementsList2.add("Passport");
        checkInRequirementsList2.add("Extra-Amount");
        
        ArrayList<Attraction> nearbyAttractionList2 = new ArrayList();
        nearbyAttractionList2.add(new Attraction("Beach"));
        nearbyAttractionList2.add(new Attraction("Canopy"));
        nearbyAttractionList2.add(new Attraction("NightClubs"));
        nearbyAttractionList2.add(new Attraction("Rapel"));
        
        ArrayList<Service> servicesList2 = new ArrayList();
        servicesList2.add(global.getGeneralServiceList().get(0));
        servicesList2.add(global.getGeneralServiceList().get(2));
        servicesList2.add(global.getGeneralServiceList().get(3));
        
        ArrayList<ImageIcon> photographsList2 = new ArrayList();
        photographsList2.add(new ImageIcon("/Img/MontannaDeFuego_Hotel.jpg"));
        
        Hotel newHotel2 = new Hotel("Montaña de Fuego", "La Fortuna", "Costa Rica",
        "2345", 4, "Rooms", "14500m2", "1987", "12:45","14:15", checkInRequirementsList2,
        nearbyAttractionList2, servicesList2, photographsList2);
        
        RoomType type4 = new RoomType("Suite",5,"Matrimonial and single beds",2,"25m2","Perfect"
        + " for people who prefer the luxurious things.",true,true,true,true,false);
        RoomType type5 = new RoomType("Single",3,"Single bed",4,"20m2",
        "Perfect for people who want to spend a nice vacation without spending much.",
        true,false,false,false,false);
        RoomType type6 = new RoomType("Double",1,"Matrimonial bed",2,"30m2",
        "Perfect for couples of friends who want to stay in one room.",true,false,
        true,false,true);
        
        newHotel2.addRoomType(type4);
        newHotel2.addRoomType(type5);
        newHotel2.addRoomType(type6);
        
        Room room4 = new Room(newHotel2,type4);
        Room room5 = new Room(newHotel2,type5);
        Room room6 = new Room(newHotel2, type6);
        
        room4.addRegister(new Register(new GregorianCalendar(2015,6,5),
        new GregorianCalendar(2015,6,8),"Nadie",1,1));
        room5.addRegister(new Register(new GregorianCalendar(2015,10,5),
        new GregorianCalendar(2015,10,8),"Pedro",2,2));
        room6.addRegister(new Register(new GregorianCalendar(2015,3,9),
        new GregorianCalendar(2015,3,13),"Paco",2,0));
        
        newHotel2.addRoom(room4);
        newHotel2.addRoom(room5);
        newHotel2.addRoom(room6);
        newHotel2.addRoom(new Room(newHotel2,type4));
        newHotel2.addRoom(new Room(newHotel2,type5));
        newHotel2.addRoom(new Room(newHotel2,type4));
        newHotel2.addRoom(new Room(newHotel2,type6));
        
        global.addHotel(newHotel2);
    }
}
