package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public String setUserName(String name) {
        if(name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$")) {
            String use =userName;
            this.userName=name;
            return use;
        }
        throw new RuntimeException("Invalid username");
    }

    public int setPassword(String name) {
        if(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$")) {
            this.password=name;
            return name.length();
        }
        throw new RuntimeException("Invalid password");
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
