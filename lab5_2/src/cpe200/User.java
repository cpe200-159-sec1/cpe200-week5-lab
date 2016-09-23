package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */

public class User {
    private String userName;
    private String password;

    public User() {
    }

    public  User(String userName, String password){
        setPassword(password);
        setUserName(userName);
    }

    public String setUserName(String name) throws RuntimeException {

        String valid = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
        String oldName = userName;
        userName = name;
        if (name.matches(valid) && name!= "") {
            userName = name;
            return oldName;
        }
        throw new RuntimeException("Invalid name");
    }

    public int setPassword(String name) throws RuntimeException {
        String valid = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{9,}$";
        if (name.matches(valid)&& name!= "") {
            password = name;
            return password.length();
        }
        throw new RuntimeException("Invalid password");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}