package day47_encapsulation;

public class Login {

    private String username;
    private String password;

    public void setUsername(String username) { // allows accessing to a private variable through a method
        this.username = username;
    }

    public void setPassword(String password) { // allows accessing to a private variable through a method
        if (password.length() >= 8) {
            this.password = password;
        }
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
