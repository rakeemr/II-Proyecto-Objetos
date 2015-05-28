package Logic;

import Graphic.LogInWindow;
import Logic.User.Administrator;
import Logic.User.Client;

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
    }
}
