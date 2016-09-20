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

    public String setUserName(String name) {
        if (!name.matches(userPattern) || name.equals("") || name.equals("null")){
            //userName = "null";
            throw new RuntimeException("Wrong input.");
        }
            String oldUserName = userName;
            this.userName = name;
            return oldUserName;

    }

    public int setPassword(String pass) {
        if (!pass.matches(passPattern) || pass.equals("") || pass.equals("null")){
            throw new RuntimeException("Wrong input.");
        }
        password = pass;
        return password.length();
    }

    public String getUserName() {


        return userName;
    }

    public String getPassword() {
        return password;
    }
}
