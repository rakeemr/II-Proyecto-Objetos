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
        char[] password = {'1','2','3'};
        global.addUser(new Administrator("David","Vargas","Male","dva",password));
        global.addUser(new Administrator("Raquel","Mora","Female","raquemora@gmail.com",password));
        global.addUser(new Client("Costa Rica","12354323","","Michael","Mendez",
        "Male","michael",password));
    }
}