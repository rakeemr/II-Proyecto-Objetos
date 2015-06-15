package Logic.User;

public class UserCreator{

    public static User createUser(String name, String lastName, String gender, String email, char[] password, String toCreate) {
        if(toCreate.equals("Administrator"))
            return new Administrator(name, lastName, gender, email, password);
        else
            return new Client(name, lastName, gender, email, password);
    }
}
