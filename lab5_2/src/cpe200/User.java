package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;
    private String userPattern = "^[A-Za-z][A-Za-z0-9]{7,}$";
    private String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";

    public User() {
        userName = null;
        password = null;
    }
    public User(String name, String pass){
        userName = null;
        password = null;
        setUserName(name);
        setPassword(pass);
    }

    public String setUserName(String name) {
        if(name.equals("")||name == null||!name.matches(userPattern))
            throw new RuntimeException("Invalid username");
        String oldUserName = userName;
        userName = name;
        return oldUserName;
    }

    public int setPassword(String name) {
        if(name.equals("")||name == null||!name.matches(passPattern))
            throw new RuntimeException("Invalid password");
        password = name;
        return password.length();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
