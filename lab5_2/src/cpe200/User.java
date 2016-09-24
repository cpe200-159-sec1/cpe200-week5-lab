package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
        userName = null;
        password = null;
    }

    public String setUserName(String name) {
        String x = "[A-Za-z][A-Za-z0-9]{7,}";
        if (name.matches(x) && !(name.equals(null))) {
            String tmp = userName;
            userName = name;
            return tmp;
        }
        throw new RuntimeException("Error");
    }

    public int setPassword(String name) {
        String x = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (name.matches(x) && !(name.equals(null))) {
            password = name;
            return password.length();
        }
        throw new RuntimeException("Error");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
