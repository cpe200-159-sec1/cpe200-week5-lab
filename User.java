package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public String setUserName(String name) {
        String test = "^[A-Za-z][A-Za-z0-9]{7,}$";
        String oName = userName;
        if(name.matches(test)) {
            this.userName = name;
        }
        else {
            throw new RuntimeException("Invalid name");
        }
        return oName;
    }

    public String getPassword() {
        return password;
    }

    public int setPassword(String name) {
        String test = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$";
        if(name.matches(test)) {
            this.password = name;
        }
        else {
            throw new RuntimeException("Invalid password");
        }
        return name.length();
    }
}

