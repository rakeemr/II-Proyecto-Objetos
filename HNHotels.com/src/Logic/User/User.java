package Logic.User;

import Logic.Cryptography;

public abstract class User {
    private String name;
    private String lastName;
    private String gender;
    private String email;
    private byte[] password;

    public User(String name, String lastName, String gender, String email, char[] arrayPassword) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        String concatenatePassword = "";
        for(char c : arrayPassword)
            concatenatePassword += c;
        this.password = Cryptography.encrypt(concatenatePassword);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Cryptography.decrypt(password);
    }

    public void setPassword(String password) {
        this.password = Cryptography.encrypt(password);
    }
    
    public void setPassword(char[] password){
        String concatenated = "";
        for(char c : password)
            concatenated += c;
        this.setPassword(concatenated);
    }
}
