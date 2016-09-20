package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public String setUserName(String name) throws RuntimeException
    {
        String uName = userName;
            String checkName = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
            if(name.matches(checkName)){
                userName = name;
            }
            else
                throw new RuntimeException("Error");
        return uName;
    }

    public int setPassword(String name)
    {   String checkPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if(name.matches(checkPassword)){
            password = name;
        }
        else {
            throw new RuntimeException("Error");
        }
        return name.length();
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
